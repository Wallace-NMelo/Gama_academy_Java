package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class positive_numbers {
    public static void main(String[] args) {
        List<Integer> arr_numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int number;
        while(true){
            int sum =0;
            while(arr_numbers.size() < 5){
                System.out.printf("\nInput the number %d for the array : ", arr_numbers.size() + 1);
                number = input.nextInt();
                if(number > 10 && number < 51){
                    arr_numbers.add(number);
                }else{
                    System.out.print("\nNumber must be above 10 and under 51\n");
                }

            }
            for (int i = 0; i < arr_numbers.size(); i++) {
                sum += (int)Math.pow(arr_numbers.get(i), 2);
            }
            System.out.print("\n Array of Values: " + arr_numbers.toString());
            System.out.print("\n Sum of Values: "+ sum);
            arr_numbers.clear();

            System.out.print("\nWant to do it again?\n (Yes or No):\n");
            if(!"yes".equals(input.next().toLowerCase().trim())){
                break;
            }
        }
    }
}
