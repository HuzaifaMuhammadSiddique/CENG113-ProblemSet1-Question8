// package part.e;
import java.util.Scanner;

public class PartE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degree Centigrade: ");
        double centigrade = input.nextDouble();

        double fahrenheit = (centigrade * 1.8) + 32;

        System.out.println(centigrade + " degrees Centigrade is equal to " + fahrenheit + " degrees Fahrenheit.");
        
        input.close();
    }

}
