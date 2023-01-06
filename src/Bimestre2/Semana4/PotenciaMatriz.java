package Semana4;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Programa para elevar una potencia dada los elementos de la matriz
 */
public class PotenciaMatriz {
    public static void main(String[] args) {
        int numeros[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//Dimension de la matriz 3 por 3
        int filas = numeros.length;
        int cols = numeros[0].length;
        int mar_potencia[][] = new int[filas][cols];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < cols; col++) {
                mar_potencia[fila][col] = (int) Math.pow(numeros[fila][col], potencia);
                System.out.print(mar_potencia[fila][col] + "\t");
            }
            System.out.println("\n");
        }

        }
    }


