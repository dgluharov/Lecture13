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

        int result = divide(number1, number2);

        System.out.println("Result is " + result);

    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
