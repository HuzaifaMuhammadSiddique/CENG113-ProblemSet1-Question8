package part.k;
import java.util.Scanner;

public class PartK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the marks of Midterm 1: ");
        int midtermOneMarks = input.nextInt();
        
        System.out.print("Enter the marks of Midterm 2: ");
        int midtermTwoMarks = input.nextInt();
        
        System.out.print("Enter final exam marks: ");
        int finalExamMarks = input.nextInt();
        
        double averageMarks = ((double) midtermOneMarks + (double) midtermTwoMarks + (double) finalExamMarks) / 3;
        System.out.println("The average marks of the student are " + averageMarks);

        input.close();
    }
}
