package Lista;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Matriz {

    private int[][] matriz;
    private int[] diagonalPrincipal;
    private int[] diagonalSecundaria;

    private int indexPrincpal = 0;
    private int indexSecundaria = 0;

    Matriz(int ordem) {
        this.matriz = new int[ordem][ordem];
        this.diagonalPrincipal = new int[ordem];
        this.diagonalSecundaria = new int[ordem];
    }

    public void setValue(int val, int row, int column) {
        if(row == column) {
            diagonalPrincipal[indexPrincpal] = val;
            indexPrincpal++;
        }
        if((row + column) == matriz.length - 1) {
            diagonalSecundaria[indexSecundaria] = val;
            indexSecundaria++;
        }
        matriz[row][column] = val;
    }

    public void printValues() {
        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz.length; ++j) {
                System.out.print(matriz[i][j] + (j == matriz.length - 1 ? "\n" : "\t"));
            }
        }
    }

    public int getSumDP() {
        return Arrays.stream(diagonalPrincipal).sum();
    }

    public int getSumDS() {
        return Arrays.stream(diagonalSecundaria).sum();
    }

    public int getGreaterDP() {
        return Arrays.stream(diagonalPrincipal).max().getAsInt();
    }

    public int getMinorrDS() {
        return Arrays.stream(diagonalSecundaria).min().getAsInt();
    }
}

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a ordem da matriz: ");
        int ordem = in.nextInt();

        Matriz matriz = new Matriz(ordem);
        
        System.out.println("\n== Cadastrar valores ==");
        for(int i = 0; i < ordem; ++i) {
            for(int j = 0; j < ordem; ++j) {
                System.out.printf("Cadastrar valor para [%d, %d]: ", i, j);
                int val = in.nextInt();
                matriz.setValue(val, i, j);
            }
        }
        System.out.println();
        
        boolean run = true;
        while(run) {
            System.out.println("\n== Menu ==");
            System.out.println("1 - Imprimir valores da matriz");
            System.out.println("2 - Mostrar soma dos elementos da diagonal principal");
            System.out.println("3 - Mostrar soma dos elementos da diagonal secundaria");
            System.out.println("4 - Mostrar maior valor da diagonal principal");
            System.out.println("5 - Mostrar menor valor da diagonal secundaria");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");
            int choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\nMatriz:");
                    matriz.printValues();
                    break;
                case 2:
                    System.out.printf("\nA soma dos elementos da diagonal principal é: %d\n", matriz.getSumDP());
                    break;
                case 3:
                    System.out.printf("\nA soma dos elementos da diagonal secundaria é: %d\n", matriz.getSumDS());
                    break;
                case 4:
                    System.out.printf("\nO maior elemento da diagonal principal é: %d\n", matriz.getGreaterDP());
                    break;
                case 5:
                    System.out.printf("\nO menor elemento diagonal secundária é: %d\n", matriz.getMinorrDS());
                    break;
                case 6:
                    run = false;
                    System.out.println("\nFinalizando...");
                    break;
            }
        }

        in.close();
    }
}
