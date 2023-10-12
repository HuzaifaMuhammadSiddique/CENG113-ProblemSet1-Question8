package part.h;
import java.util.Scanner;

public class PartH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter height of the cylinder: ");
        double height = input.nextDouble();
        
        double volumeOfCylinder = 3.1416 * radius * radius * height;
        double areaOfCylinder = (2 * 3.1416 * radius * radius) + (2 * 3.1416 * radius * height);
        
        System.out.println("A cylinder with a radius of " + radius + " units and a height of " + height + " units has a volume of " + volumeOfCylinder + " units cubed and a surface area of " + areaOfCylinder + " units squared.");

        input.close();
    }
}
