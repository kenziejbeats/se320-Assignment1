import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 10: ");
        int num = scan.nextInt();

        assert (num >= 0 && num <= 10) : "The number is out of range.";

        System.out.println("You entered: " +num);

        scan.close();
    }
}
