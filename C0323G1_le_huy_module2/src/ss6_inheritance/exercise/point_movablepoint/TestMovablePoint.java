package ss6_inheritance.exercise.point_movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setXY(2.55f,4.55f);
        System.out.println(movablePoint);
        movablePoint.setSpeed(4.123f,5.12f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
