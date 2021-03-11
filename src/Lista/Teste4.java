package Lista;

import java.util.Scanner;

public class Teste4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Insert yout age: \n");
        age = input.nextInt();
        if (age < 18){
            System.out.print("You're a Child.");
        } else if (age >= 18 & age < 65){
            System.out.print("You're a Adult.");
        }else{
            System.out.print("You're a Elderly Person.");
        }
    }
}
