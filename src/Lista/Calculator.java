package Lista;

import java.util.Scanner;

public class Calculator {
    private float solution;


    public Calculator() {
        solution = 0;

    }

    public float addition(float x, float y) {
        return x + y;
    }

    public float subtration(float x, float y) {
        return x - y;
    }

    public float multiplication(float x, float y) {
        return x * y;
    }

    public float division(float x, float y) {
        solution = (float) (x / y);
        return solution;
    }

    public void calc(char operator, float x, float y) {
        System.out.print("Operation : " + operator + "\n");

        switch (operator) {
            case '+':
                System.out.println(x + " + " + y + " = " + addition(x, y));
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + subtration(x, y));
                break;
            case '*':
                System.out.println(x + " * " + y + " = " + multiplication(x, y));
                break;
            case '/':
                System.out.println(x + " / " + y + " = " + division(x, y));
                break;
            default:
                System.out.print("Invalid Operation: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y;
        char operator;
        while (true) {
            System.out.print("Input the operand x: ");
            x = input.nextFloat();
            System.out.print("\nInput the operand y: ");
            y = input.nextFloat();
            System.out.print("\nInput the operation: ");
            operator = input.next().charAt(0);
            Calculator calc = new Calculator();
            calc.calc(operator, x, y);
            System.out.print("Want to do it again?\n (Yes or No):\n");
            if (!"yes".equals(input.next().toLowerCase().trim())) {
                break;
            }
        }
    }
}
