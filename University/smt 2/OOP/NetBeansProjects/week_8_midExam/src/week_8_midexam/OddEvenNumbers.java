
package week_8_midexam;

import java.util.Scanner;

public class OddEvenNumbers {
    private int number;
    public int getnumber(){
        return number;
    }
    public void setnumber(int x){
        this.number=x;
    }
    public void OddOrEven(){
        
        if(number%2==0){
            System.out.println("Number "+ number + " is an even number");
        }else{
            System.out.println("Number " + number + " is an odd number");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number = ");
        int x = sc.nextInt();
        sc.close();

        OddEvenNumbers oen = new OddEvenNumbers();
        oen.setnumber(x);
        oen.OddOrEven();
    }
}