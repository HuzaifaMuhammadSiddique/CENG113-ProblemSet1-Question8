package part.j;
import java.util.Scanner;

public class PartJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of an item in turkish liras: ");
        double cost = input.nextDouble();
        
        double vat = cost * 0.12;
        double newCost = cost + vat;

        System.out.println("The VAT on this item is " + vat + " TL and the cost of this item including the VAT is " + newCost + " TL.");
        
        input.close();
    }
}
