package part.r;
import java.util.Scanner;

public class PartR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();       
        int onlyMeters = (int) meters;
        
        double cm = meters * 100; 
        cm = cm - (onlyMeters * 100);
        int onlyCm = (int) cm;
        
        double mm = meters * 1000;
        mm = mm - (onlyMeters * 1000);
        mm = mm - (onlyCm * 10);
        int onlyMm = (int) mm;
        
        System.out.print(onlyMeters + " meters   ");
        System.out.print(onlyCm + " cm   ");
        System.out.println(onlyMm + " mm");
        input.close();
    }
}
