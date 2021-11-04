package tasks.homework.calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        int number1;
        int number2;
        char operation;
        int result;

        Scanner reader = new Scanner(System.in);

        System.out.print("Type operator (+ - / *): ");
        operation = reader.next().charAt(0);
        System.out.print("First int number : ");
        number1 = reader.nextInt();
        System.out.print("Second int number: ");
        number2 = reader.nextInt();

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.print("Wrong operator. Calc stopped");
                return;
        }
        System.out.println("Result: " + result);

    }

}
