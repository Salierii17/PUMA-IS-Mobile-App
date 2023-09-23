package Gradebook;

public class GradeBook {

    private String courseName;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for \n%s!\n",
                getCourseName());
    }
}
class GradeBookTest {
    public static void main(String args[]) {
            GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming");
            GradeBook gradeBook2 = new GradeBook("CS102 Data Structure in Java");

            System.out.printf(" gradebook1 course name is: %s\n ",
                            gradeBook1.getCourseName());
            System.out.printf("gradebook2 course name is: %s\n",
                            gradeBook2.getCourseName());
    }
}
