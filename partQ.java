package part.q;
import java.util.Scanner;

public class PartQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();
        
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        
        System.out.print(firstDigit + "  ");
        System.out.print(secondDigit + "  ");
        System.out.println(thirdDigit);
        
        input.close();
    }
    
}



