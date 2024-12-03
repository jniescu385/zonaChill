package TEMA3.Boletín_Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Tamaño fila");
        int fila = entrada.nextInt();

        System.out.println("Tamaño columna");
        int columna = entrada.nextInt();

        int[][] matriz = new int[fila][columna];

        System.out.println("Rellenalo");
        rellenaMatriz(matriz);

        int numero; //Variable para guardar los números que ocupan las posiciones [i] [j]

        //Recorro las posiciones de la matriz
        for (int i = matriz.length - 1; i >= 0; i--) { //Recorre fila
            for (int j = matriz[i].length - 1; j >= 0; j--) { //Recorre columnas
                numero = matriz[i][j]; //Guardo cada numero de las posiciones en "Emilio" y la imprimo en la siguiente fila
                System.out.print(numero + ", ");
            }
        }
    }

    private static void rellenaMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Pon la posición [" + i + " ] [ " + j + " ]");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
}