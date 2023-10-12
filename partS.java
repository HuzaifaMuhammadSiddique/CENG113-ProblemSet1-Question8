package part.s;
import java.util.Scanner;

public class PartS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter time in minutes: ");
        int minutes = input.nextInt();
        
        int days = minutes / 1440;
        minutes = minutes - (days * 1440);
        
        int hours = minutes / 60;
        minutes = minutes - (hours * 60);
        
        System.out.print(days + " days   ");
        System.out.print(hours + " hours   ");
        System.out.println(minutes + " min");
        
        input.close();
    }  
}



