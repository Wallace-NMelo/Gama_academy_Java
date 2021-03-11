package Lista;

import javax.swing.JOptionPane;

class Square{
    float p;
    double A;
    Square(float perimeter_sq, double Area_sq){
        p = perimeter_sq;
        A = Area_sq;
    }
}

class Triangule{
    float p, A;
    Triangule (float perimeter_t, float Area_t){
        p = perimeter_t;
        A = Area_t;
    }
}
class Circle{
    double p, A;
    Circle (double perimeter_c, double Area_c){
        p = perimeter_c;
        A = Area_c;
    }
}
public class Test6 {

    static Square get_Square(float side){
        return new Square(4 * side, Math.pow(side, 2));
    }

    static Triangule get_Triangule(float height, float base){
        return new Triangule(base * height/2, 3*base);
    }

    static Circle get_Circle(float circle_radius){
        return new Circle(2 * Math.PI * circle_radius, Math.pow(circle_radius, 2));
    }

    public static void main(String[] args) {
        String polygon;

        polygon = JOptionPane.showInputDialog("Input the Type of the Polygon:\n (Square, Triangule or Circle)\n:");
        System.out.print("Type:" + polygon + "\n");
        switch (polygon.toLowerCase()){
            case "square":
                float side = Float.parseFloat(JOptionPane.showInputDialog("Input the side of the square\n:"));
                Square answer_S = get_Square(side);
                System.out.println("Area:" + answer_S.A + "\nPerimeter:" + answer_S.p);
                break;
            case "triangule":
                float base = Float.parseFloat(JOptionPane.showInputDialog("Input the base of the triangule\n:"));
                float height = Float.parseFloat(JOptionPane.showInputDialog("Input the height of the triangule\n:"));
                Triangule answer_T = get_Triangule(height, base);
                System.out.println("Area:" + answer_T.A+ "\nPerimeter:" + answer_T.p);
            case "Circle":
                float circle_radius = Float.parseFloat(JOptionPane.showInputDialog("Input the radious of the circle\n:"));
                Circle answer_C = get_Circle(circle_radius);
                System.out.println("Area:" + answer_C.A+ "\nPerimeter:" + answer_C.p);
            default:
                throw new IllegalArgumentException("Invalid  operation:" + polygon);
        }
    }
}
