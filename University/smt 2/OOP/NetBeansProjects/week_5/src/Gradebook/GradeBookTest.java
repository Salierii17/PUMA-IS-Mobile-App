package Gradebook;

public class GradeBookTest {
        public static void main(String args[]) {
                GradeBook gradeBook1 = new GradeBook(
                                "CS101 Introduction to Java Programming");
                GradeBook gradeBook2 = new GradeBook(
                                "CS102 Data Structure in Java");

                System.out.printf("gradebook1 course name is: %s\n ",
                                gradeBook1.getCourseName());
                System.out.printf("gradebook2 course name is: %s\n",
                                gradeBook2.getCourseName());
        }
}
