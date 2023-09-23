package Exercise;

public class Exercise_8 {
    public static void main(String []  args) {
        int total_item= 10;
        int price= 5;
        int tax=10;
        
    
        System.out.println("Total Items: "+total_item);
        System.out.println("Price per item: "+price+"$");
        System.out.println("Sub Total = "+total_item*price+"$");
        System.out.println("Tax = 10% = "+ (total_item*price)/tax+"$");
        int total_price=(total_item*price)+(total_item*price)/tax;
        System.out.println("Total Price = "+total_price+"$");                 
                }
}
