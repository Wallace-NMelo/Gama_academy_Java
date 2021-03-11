package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_divisor {
    public static List<Integer> divisors(int n, int N){
        List<Integer> arr = new ArrayList<>();
        for(int i=1; i <=N; i++){
            if(i%n == 0){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, N;
        List<Integer> arr_numbers = new ArrayList<>();
        System.out.print("Input the divisor: ");
        n = input.nextInt();
        System.out.print("\nInput the maximal number: ");
        N = input.nextInt();
        arr_numbers = divisors(n, N);
        System.out.print("\nDivisors :\n" + arr_numbers.toString());

    }
}
