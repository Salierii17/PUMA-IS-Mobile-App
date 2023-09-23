
package week_8_midexam;

import java.util.Scanner;

public class studentHeight {
    public static void main(String[] args) {
        int max=0;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much students ? ");
        int term = sc.nextInt();
            for(int i = 0; i <term; i++){
                System.out.print("Enter student height : ");
                int h = sc.nextInt();
                sum+=h;
                if(h>max){
                    max=h;
                }
            } 
        System.out.println("max heigth is "+ max);
        System.out.println( "Average heigth is "+ sum/term);
        
        sc.close();       
    }
}