package part.l;
import java.util.Scanner;

public class PartL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the marks of Midterm 1: ");
        int midtermOneMarks = input.nextInt();
        
        System.out.print("Enter the marks of Midterm 2: ");
        int midtermTwoMarks = input.nextInt();
        
        System.out.print("Enter final exam marks: ");
        int finalExamMarks = input.nextInt();
        
        double averageMarks = (((double) midtermOneMarks) * 0.25) + (((double) midtermTwoMarks) * 0.30) + (((double) finalExamMarks) * 0.45);
        System.out.println("The average marks of the student are " + averageMarks);
        input.close();
    }  
}

