package ss6_inheritance.exercise.point_movablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(5.123f, 10.456f);
        System.out.println(point);
        point = new Point(10.123f, 20.12f);
        System.out.println(point);
        point.setX(4.567f);
        point.setY(1.123f);
        System.out.println(point);
    }
}
