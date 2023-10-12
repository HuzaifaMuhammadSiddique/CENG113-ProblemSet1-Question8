package part.i;
import java.util.Scanner;

public class PartI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of turkish liras: ");
        double turkishLiras = input.nextDouble();
        
        double vat = turkishLiras * 0.08;

        System.out.println("The VAT on " + turkishLiras + " TL is " + vat + " TL.");
        
        input.close();
    }
    
}
