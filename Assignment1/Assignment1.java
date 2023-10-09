import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
        Assignment1 assignment1 = new Assignment1();

        Scanner in = new Scanner(System.in);
        int num1 = assignment1.getUserIntInput(in);
        int num2 = assignment1.getUserIntInput(in);
        System.out.println(num1 + num2);

        int randomInts[] = new int[100];
        randomInts = assignment1.fillArray(randomInts);
        int userIndex = assignment1.getUserIntInput(in);

        try {
            System.out.println(randomInts[userIndex]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds");
        } 
    }

    public int getUserIntInput(Scanner in) {
        if (in.hasNextInt()) {
            return in.nextInt();
        }
        System.out.println("Please enter a valid integer.");
        in.next();
        return getUserIntInput(in);
    }

    public int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }
}