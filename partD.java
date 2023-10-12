// package part.d;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double centigrade = (fahrenheit - 32) / 1.8;
        
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + centigrade + " degrees Centigrade.");
        
        input.close();
    }
    
}
