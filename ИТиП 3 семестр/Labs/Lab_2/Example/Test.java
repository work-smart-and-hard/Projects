public class Test {
    public static void main(String[] args) {
        Point3d myPoint = new Point3d();
        Point3d myOtherPoint = new Point3d(5,3,0);
        myPoint.setX(44);
        myPoint.setY(57);
        myPoint.setZ(126);
        System.out.println("Координаты точки myPoint:");
        System.out.println("X: " + myPoint.getX());
        System.out.println("Y: " + myPoint.getY());
        System.out.println("Z: " + myPoint.getZ());
        myOtherPoint.setX(123.45);
        myOtherPoint.setY(345.6);
        myOtherPoint.setZ(78.56);
        System.out.println();
        System.out.println("Координаты точки myOtherPoint:");
        System.out.println("X: " + myOtherPoint.getX());
        System.out.println("Y: " + myOtherPoint.getY());
        System.out.println("Z: " + myOtherPoint.getZ());
    }
}
