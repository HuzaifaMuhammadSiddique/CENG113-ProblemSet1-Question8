// package part.c;
import java.util.Scanner;


public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length in feet: ");
        double feet = input.nextDouble();
        
        double mm = feet * 12 * 2.54 * 10;
        
        System.out.println(feet + " feet are equal to " + mm + " mm.");
        
        input.close();
    }
    
}
