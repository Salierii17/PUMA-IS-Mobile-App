package dimensional;
class MyMain {
    
    public static void main(String args[]) {
        
        Circle aCircle;
        aCircle = new Circle();
        aCircle.x = 10;
        aCircle.y = 20;
        aCircle.r = 5;
        double area = aCircle.area();
        double circumf = aCircle.circumference();
        System.out.println("Radius="+aCircle.r+" Area="+area);
        System.out.println("Radius="+aCircle.r+" Circuference="+circumf);        
    }
}
