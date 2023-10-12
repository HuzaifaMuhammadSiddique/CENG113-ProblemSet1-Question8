// package part.g;
import java.util.Scanner;

public class PartG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the diameter of the circle: ");
        double diameter = input.nextDouble();

        double perimeterOfCircle = diameter * 3.1416;
        double areaOfCircle = 3.1416 * (diameter / 2) * (diameter / 2);

        System.out.println("A circle with diameter " + diameter + " units has an area of " + areaOfCircle + " units squared and a perimeter of " + perimeterOfCircle + " units.");

        input.close();
    }

}
