package part.o;
import java.util.Scanner;

public class PartO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the wholesale price of the car: ");
        double wholesalePrice = input.nextDouble();
        
        double dealersMarkup = wholesalePrice * 0.12;
        double salesTax = (wholesalePrice + dealersMarkup) * 0.06;
        double consumerCost = wholesalePrice + dealersMarkup + salesTax;
        
        System.out.println("The consumer cost for this car is " + consumerCost + ".");
        
        input.close();
    }
    
}




