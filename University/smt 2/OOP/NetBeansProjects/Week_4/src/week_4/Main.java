
package week_4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println();
        System.out.println(name);
    }

}
