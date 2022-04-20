import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        number1 = scanner.nextInt();
        System.out.println("Second number:");
        number2 = scanner.nextInt();

        try {
            int result = divide(number1, number2);
            System.out.println("Result is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("You are trying to divide by zero");
            ex.printStackTrace();
        }
        /*int[] array = {11, 22, 33};

        System.out.println("Enter the number of element you want to see:");
        int number = scanner.nextInt();
        getElementFromArray(array, number);*/


    }

    private static void getElementFromArray(int[] array, int number) {
        try {
            System.out.println(array[number]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("You are trying to reach an element outside the array boundaries");
            ex.printStackTrace();
        }
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
