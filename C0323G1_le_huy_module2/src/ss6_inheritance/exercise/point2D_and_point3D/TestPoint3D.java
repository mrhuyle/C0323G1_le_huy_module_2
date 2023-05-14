package ss6_inheritance.exercise.point2D_and_point3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(4,5,6);
        System.out.println(point3D.toString());
        point3D = new Point3D(7,8,9);
        System.out.println(point3D.toString());
    }
}
