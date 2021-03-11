package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste8 {
    public static void main(String[] args) {
        boolean Start = true;
        String s;
        int n;
        Scanner input = new Scanner(System.in);
        while (Start) {
            List<Integer> numbers_arr = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                System.out.print("Input the number " + i + " :\n");
                n = input.nextInt();
                if (n % 2 == 0) {
                    numbers_arr.add(n);
                }
            }
            System.out.print("The even numbers are:\n" + numbers_arr.toString() + "\n");
            System.out.print("Want to do it again?\n (Yes or No):\n");
            Start = "yes".equals(input.next().toLowerCase().trim());

        }
        input.close();
    }
}
