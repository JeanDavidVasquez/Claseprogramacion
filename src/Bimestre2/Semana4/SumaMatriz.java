package Semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b [][] = {{3,4,1},{7,9,1},{5,2,3}};
        int filas = a.length;
        int cols = a[0].length;
        int c [][] = new int[filas][cols];
        int filas2 = c.length;
        //suma de matrices a + b = c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                c[fila] [col] = a[fila][col] + b[fila][col];
            }
        }
        //Mostrar resultado o matriz c
        for (int fila = 0; fila < a.length; fila++) {
            for (int columna = 0; columna < a[0].length; columna++) {
                System.out.print(c[fila][columna] + "\t");
            }
            System.out.println("\n");
        }
    }
}
