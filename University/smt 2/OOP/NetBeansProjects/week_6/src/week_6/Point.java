
package week_6;


public class Point {
    private int x;
    private int y;

    public Point(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }
    public double dinstaceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;
    }
    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }
}

class PointMain4 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(4, 3);

        System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");

        p2.translate(2, 4);
        System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
