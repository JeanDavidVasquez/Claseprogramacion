import java.util.Scanner;

public class TareaMulMatriz {
    public static void main(String[] args) {
        Scanner tecldo = new Scanner(System.in);
        System.out.println("PRIMERA FILA DE PRIMERA MATRIZ");
        int f1 = tecldo.nextInt();
        System.out.println("PRIMERA COLUMNA DE PRIMERA MATRIZ");
        int c1= tecldo.nextInt();
        System.out.println("SEGUNDA FILA DE SEGUNDA MATRIZ");
        int f2 = tecldo.nextInt();
        System.out.println("SEGUNDA COLUMNA DE SEGUNDA MATRIZ");
        int c2= tecldo.nextInt();
        int matriza [][]= new int[f1][c1];
        int matrizb[][]= new int[f2][c2];
        int matrizc[][]=new int[matriza.length][matrizb[0].length];
        if (c1==f2){
            System.out.println("INGRESE NUMEROS PRIMERA MATRIZ");
            for (int indice1 = 0; indice1 < matriza.length; indice1++) {
                for (int indice2 = 0; indice2 < matriza[0].length; indice2++) {
                    matriza[indice1][indice2]= tecldo.nextInt();
                }
            }
            System.out.println("INGRESE NUMEROS SEGUNDA MATRIZ");
            for (int indice1 = 0; indice1 < matrizb.length; indice1++) {
                for (int indice2 = 0; indice2 < matrizb[0].length; indice2++) {
                    matrizb[indice1][indice2]= tecldo.nextInt();
                }
            }
            System.out.println("PRIMERA MATRIZ");
            for (int indice = 0; indice < matriza.length; indice++) {
                for (int indice2 = 0; indice2 < matriza[0].length; indice2++) {
                    System.out.print(matriza[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("SEGUNDA MATRIZ");
            System.out.println("\t");
            for (int indice = 0; indice < matrizb.length; indice++) {
                for (int indice2 = 0; indice2 < matrizb[0].length; indice2++) {
                    System.out.print(matrizb[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            for (int fila = 0; fila < matriza.length; fila++) {
                for (int columna = 0; columna < matrizb[0].length; columna++) {
                    for (int mov = 0; mov < matriza[0].length; mov++) {
                        matrizc[fila][columna] =matrizc[fila][columna]+(matriza[fila][mov] * matrizb[mov][columna]);
                    }
                }
            }
            System.out.println("\t");
            System.out.println("TERCERA MATRIZ");
            for (int indice = 0; indice < matrizc.length; indice++) {
                for (int indice2 = 0; indice2 < matrizc[0].length; indice2++) {
                    System.out.print(matrizc[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
        }else{
            System.out.println("LOS NUMEROS INGRESADOS SON INCORRECTOS");
            System.out.println("PORFAVOR INGRESE LOS NUMEROS DE NUEVO");
        }
    }
}
