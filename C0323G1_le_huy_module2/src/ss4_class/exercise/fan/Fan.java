package ss4_class.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public String getSpeed() {
        String result = "";
        switch (this.speed) {
            case SLOW:
                result = "SLOW";
                break;
            case MEDIUM:
                result = "MEDIUM";
                break;
            case FAST:
                result = "FAST";
                break;
        }
        return result;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public boolean setOn() { //true or false
        return this.on = !this.on;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public Fan() { //Declare method
    }

    public void toStringStatus() {
        if (this.on == true) {
            String result = "Fan is ON: " + this.getSpeed() + " ; " + this.getColor() + " ; " + this.getRadius();
            System.out.println(result);
        } else {
            String result = "Fan is OFF: " + this.getColor() + " ; " + this.getRadius();
            System.out.println(result);
        }
    }

}
