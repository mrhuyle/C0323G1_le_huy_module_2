package ss6_inheritance.exercise.point_movablepoint;

import java.util.Arrays;
import java.util.Objects;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arr = {getXSpeed(), getYSpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return "A moveable point with is a subclass of a point "
                + super.toString()
                + " , has speed "
                + Arrays.toString(getSpeed());
    }

    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
