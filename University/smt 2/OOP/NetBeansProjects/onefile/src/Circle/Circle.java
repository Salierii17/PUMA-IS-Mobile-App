package Circle;
public class Circle {
    public double x,y; 
    public double r ;

    public double circumference() {
        return 2*3.14*r;
    }
    public double area() {
        return 3.14*r*r;
    }
    
    public static void main(String args[]) {
        
        Circle aCircle;
        aCircle = new Circle();
        aCircle.x = 70;
        aCircle.y = 30;
        aCircle.r = 7;
        double area = aCircle.area();
        double circumf = aCircle.circumference();
        System.out.println("Radius="+aCircle.r+" Area="+area);
        System.out.println("Radius="+aCircle.r+" Circuference="+circumf);        
    }
}




