import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner n = new Scanner(System.in);

        while (true) {
        System.out.print("Enter the number (enter q to exit) ");
        String input = n.next();

        if(input.equals("q")) {
            break;
        }
        try {
            int number = Integer.parseInt(input);

            if (number<0) {
                System.out.println("Please input a positive number! (enter q to exit) ");
            } else {
                int factorial = findFactorial(number);
                System.out.println("The factorial of "+ number + "! is " + factorial );
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input!!! Please input a number (enter q to exit)");
        }
        }

    }
//    methods to calculate factorial
    public static int findFactorial(int number) {
        int result =1;
        if (number == 0) {
            return result;
        } else {
            for (int i = 1; i<=number; i++){
            result *=i;
            }
            return result;
        }
    }

}

