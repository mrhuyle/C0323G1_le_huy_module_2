package ss4_class.exercise.fan;

public class TestFan {
    public static void main(String[] args) {
        //Create Fan1:
        System.out.println("You have created the Fan1 thas has following status: ");
        Fan fan1 = new Fan();
        String fan1Color = "yellow";
        fan1.setColor(fan1Color);
        double fan1Radius = 10;
        fan1.setRadius(fan1Radius);
        fan1.setOn(); //Turn ON
        fan1.setSpeed(3); //Set max speed
        fan1.toStringStatus();

        //Create Fan2:
        System.out.println("You have created the Fan2 thas has following status: ");
        Fan fan2 = new Fan(); //fan2 has default color, default off status
        double fan2Radius = 5;
        fan2.setRadius(fan2Radius);
        fan2.setSpeed(2); //Set medium speed
        fan2.toStringStatus();
    }
}
