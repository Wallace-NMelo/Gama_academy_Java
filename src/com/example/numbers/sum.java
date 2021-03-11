package com.example.numbers;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        int number1, number2, sum;

        Scanner input = new Scanner(System.in);     //cria Scanner para obter entrada a partir da janela de comando


        System.out.print("Enter the first intergrer: \n"); //prompt
        number1 = input.nextInt();
        System.out.print("Enter the second intergrer: \n"); //prompt
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("Sum is %d \n", sum);

    }


}
