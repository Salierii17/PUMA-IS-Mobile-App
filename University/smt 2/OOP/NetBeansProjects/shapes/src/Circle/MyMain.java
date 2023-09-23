package Circle;
class MyMain {
 
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
