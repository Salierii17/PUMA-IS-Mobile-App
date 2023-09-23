package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args){
        int T;

        System.out.println("contoh IF tiga kasus");
        System.out.println("Suhu(der. C) = ");

        Scanner scanner = new Scanner(System.in);
        T= scanner.nextInt();
        scanner.close();

        if(T<0){
            System.out.println("Wujud air beku " + T + " C");
        }else if ((0 <=T) && (T <= 100)){
            System.out.println("Wujud air cair " + T + " C");
        }else if (T>100){
            System.out.println("Wujud ari uap/gas " + T + " C");
        }

    }
}
