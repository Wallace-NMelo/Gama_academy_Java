package Lista;

import java.util.Locale;
import java.util.Scanner;

public class Teste5_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // setar o locale
        String polygon;
        System.out.print("Input the Type of the Polygon:\n (Square, Triangule or Circle)\n:");
        polygon = input.nextLine();
        System.out.print("Type:" + polygon + "\n");
        switch (polygon.toLowerCase()) {
            case "square":
                float Side;
                System.out.print("Input the side of the square\n:");
                Side = input.nextFloat();
                System.out.println("Area:" + Side * Side + "\nPerimeter:" + 4 * Side);
                break;
            case "triangule":
                float base, height;
                System.out.print("Input the height of the triangule\n:");
                height = input.nextFloat();
                System.out.print("Input the base of the triangule\n:");
                base = input.nextFloat();
                System.out.println("Area:" + base * (height / 2) + "\nPerimeter:" + 3 * base);
                break;
            case "circle":
                float circle_radius;
                System.out.print("Input the radious of the circle\n:");
                circle_radius = input.nextFloat();
                System.out.println("Area:" + Math.pow(circle_radius, 2) + "\nPerimeter:" + 2 * Math.PI * circle_radius);
                break;
            default:
                throw new IllegalArgumentException("Invalid  operation:" + polygon);
        }
    }
}
