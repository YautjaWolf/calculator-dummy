/**
 * @author Natetra Ly
 * @date 12/4/2024
 * @version 1
 * Simple calculator program
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        char operator;
        int firstNum, secondNum;
        int res;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, /");
        operator = userInput.next().charAt(0);

        System.out.println("Enter two numbers:");
        try {
            firstNum = userInput.nextInt();
            secondNum = userInput.nextInt();

            res = calcResult(operator, firstNum, secondNum);
            System.out.println("Result: " + res);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only!");
        } catch (ArithmeticException e) {
            System.out.println("Error during calculation: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            userInput.close();
        }

        System.out.println("Program finished.");
        System.exit(0);
    }

    public static int calcResult(char operator, int firstNum, int secondNum) {
        int res = 0;
        if (operator == '+') {
            res = add(firstNum, secondNum);
        } else if (operator == '-') {
            res = subtract(firstNum, secondNum);
        } else if (operator == '*') {
            res = multiply(firstNum, secondNum);
        } else if (operator == '/') {
            res = divide(firstNum, secondNum);
        } else {
            throw new IllegalArgumentException("Invalid operator!: " + operator);
        }
        return res;
    }
    public static int add(int firstnum, int secondnum) {
        return firstnum + secondnum;
    }

    public static int subtract(int firstnum, int secondnum) {
        return firstnum - secondnum;
    }
    public static int multiply(int firstnum, int secondnum) {
        return firstnum * secondnum;
    }

    public static int divide(int firstnum, int secondnum) {
        if (secondnum == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return firstnum / secondnum;
    }
}
