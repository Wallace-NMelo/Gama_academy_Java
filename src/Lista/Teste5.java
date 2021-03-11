package Lista;

public class Teste5 {
    public static void main(String[] args) {
        int x = 30;
        int y = 14;
        int z = --x/++y;
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        int w = 10*z++;
        int k = --w%2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);
        System.out.println("k = " + k);
    }
}
