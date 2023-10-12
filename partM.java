package part.m;
import java.util.Scanner;

public class PartM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();
        
        System.out.print("Enter speed in km/h: ");
        double speedInKmPerHour = input.nextDouble();
        
        double speedInMeterPerSecond = (speedInKmPerHour * 5) / 18;
        
        double time = distance / speedInMeterPerSecond;
        
        System.out.println("The time taken for the car to travel " + distance + " meters is " + time + " seconds.");
        
        input.close();
    }
}
