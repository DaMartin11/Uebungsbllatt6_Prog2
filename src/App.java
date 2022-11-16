public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************");
       /*  Point point =new Point(3,3);
        // point.distance(1,3);
         System.out.println("the distance: " + point.distance());
         System.out.println("the distance: " + point.distance(4, 0));
        */

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance()); //7.810249675906654
        System.out.println("distance(second)= " + first.distance(second)); // NaN u should fix it
        System.out.println("distance(2,2)= " + first.distance(2,2));// 5.0
        Point point = new Point();
        System.out.println("distance()= " + point.distance());// 0.0
    }
}
