package part.n;
import java.util.Scanner;

public class PartN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the initial velocity of the car: ");
        double initialVelocity = input.nextDouble();
        
        System.out.print("Enter the final velocity of the car: ");
        double finalVelocity = input.nextDouble();
        
        System.out.print("Enter the time taken by the car: ");
        double timeTaken = input.nextDouble();
        
        double acceleration = (finalVelocity - initialVelocity) / timeTaken;
        
        System.out.println("The acceleration of the car is " + acceleration + ".");
        input.close();
    }
}


