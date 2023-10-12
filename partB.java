package part.b;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of turkish liras: ");
        double turkishLiras = input.nextDouble();
        
        double dollars = turkishLiras * 0.036;
        double euros = turkishLiras * 0.034;
        
        System.out.println(turkishLiras + " turkish liras are equal to " + dollars + " dollars and " + euros + " euros.");
        
        input.close();
    }
    
}
