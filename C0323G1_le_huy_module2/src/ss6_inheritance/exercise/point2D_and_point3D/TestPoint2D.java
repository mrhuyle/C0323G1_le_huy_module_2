package ss6_inheritance.exercise.point2D_and_point3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(5);
        point2D.setY(10);
        System.out.println(point2D);
        point2D = new Point2D(2,3);
        System.out.println(point2D);
        point2D.setXY(4,6);
        System.out.println(point2D);
    }
}
