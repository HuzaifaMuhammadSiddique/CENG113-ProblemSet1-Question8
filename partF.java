// package part.f;
import java.util.Scanner;

public class PartF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Kelvin: ");
        double kelvin = input.nextDouble();

        double centigrade = kelvin - 273;
        double fahrenheit = (centigrade * 1.8) + 32;
        double rankine = fahrenheit + 512;

        System.out.println(kelvin + " degrees Kelvin is equal to " + rankine + " degrees Rankine.");
        
        input.close();
    }
}
