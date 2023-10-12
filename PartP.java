package part.p;
import java.util.Scanner;

public class PartP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sales: ");
        double sales = input.nextDouble();
        
        System.out.print("Enter the total value of sales in dollars: ");
        double totalValue = input.nextDouble();
        
        double baseSalary = 400.0;
        
        double salary = baseSalary + (50 * sales) + (totalValue * 0.01);
        
        System.out.println("The final salary of this employee is $" + salary + ".");
        
        input.close();
    }
}



