/**
 * 描述二位空间中的一个点
 */

public class Point {

    double x;
    double y;

    private Point (double _x, double _y) {
        x = _x;
        y = _y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);

        System.out.println(p1.x);
    }
}
