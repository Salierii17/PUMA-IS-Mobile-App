
// overlooding
package Polymorphism;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.add(5, 6));
        System.out.println(cl.add(4, 7, 8));
    }
}