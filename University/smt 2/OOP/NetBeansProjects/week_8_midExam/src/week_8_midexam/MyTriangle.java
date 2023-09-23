package week_8_midexam;

import java.util.Scanner;


public class MyTriangle {
    private int length;

    public MyTriangle(int x){
        length= x;
    }
    public void setlength (int  x){
        this.length =  x;
    }
    public int getlength (){
        return length;
    }
    public void draw (){
        for (int c = 0; c<getlength();c++){
            for (int i =0; i<=c;i++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int x = sc.nextInt();
        sc.close();
        MyTriangle tr = new MyTriangle(x);
        tr.setlength(x);
        tr.draw();
    }
}


