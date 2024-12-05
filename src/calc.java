/**
 * @author Natetra Ly
 * @date 12/4/2024
 * @version 1
 * Simple calculator program
 */

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        char operator;
        int firstNum, secondNum;
        int res;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose operator +, -, *, /");
        operator = userInput.next().charAt(0);

        System.out.println("Enter numbers to be calculated");

        try {
            firstNum = userInput.nextInt();
            secondNum = userInput.nextInt();
            res = calcResult(operator, firstNum, secondNum);
            System.out.println(res);
        } catch(Exception e) {
            System.out.println("Program failed to finish due to input mismatch exception!");
        }
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
            System.out.println("Cannot calculate. That operand/operation is beyond this calculator's functionality!");
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
        int res = 0;
        try {
            res = firstnum / secondnum;
        } catch(ArithmeticException e) {
            System.out.println("Answer does not exist! -- / by 0! --");
        }
        if (res == 0) {
            System.out.println("Done!");
        }
        return res;
    }
}