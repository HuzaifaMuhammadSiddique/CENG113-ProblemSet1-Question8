// package part.a;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount in dollars: ");
        double dollars = input.nextDouble();
        
        double turkishLiras = dollars * 27.73;
        
        System.out.println(dollars + " dollars are equal to " + turkishLiras + " turkish liras.");
        
        input.close();
    }
    
}
