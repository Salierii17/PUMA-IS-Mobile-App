import java.util.Scanner;

public class question_6 {
    public  static void  main(String args []) {
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa lemparan : ");
        int counter = scanner.nextInt();
        for (int i=1; i <=counter; i++) {

        System.out.print("Jarak : ");
        int D = scanner.nextInt();
        if (0<=D && D<=2000) {
            if ( D<=800) {
                score+=1;
            } else if ( 800< D && D<=1400) {
                score+=2;
            } else if ( 1400< D && D<=2000) {
                score+=3;
            }

        }
            System.out.println("    Jarak   " + "  score   ");
            System.out.println("     "+D + "        " + score);
            score=0;
        }
    }
}
