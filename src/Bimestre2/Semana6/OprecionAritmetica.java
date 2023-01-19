package Semana6;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Programa para crear metodos para realizar operacioes aritmeticas
 */
public class OprecionAritmetica {
    //Creacion de variables globales
    int n1;
    int n2;

    /**
     * Metodo para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int sumar(int n1, int n2){
        return (n1 +n2);
    }

    /**
     * Metodo para realizar la resta de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int restar(int n1, int n2) {
        return (n1 - n2);
    }

    /**
     * Metodo para realizar la multiplicacion de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public void multiplicacion(int n1, int n2) {
        System.out.println("La multiplicacion es: " + (n1 * n2));
    }
    public void division() {
        if (n2 > 0) {
            System.out.println("La division es: " + ((double) n1 / (double) n2));
        } else {
            System.out.println("Division por 0 no existe");
        }
    }
    public  void ejecutar(){
        Scanner teclado  = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor == true){
            System.out.println("Digite 0 para salir");
            System.out.println("Digite 1 para sumar dos numeros: ");
            System.out.println("Digite 2 para restar dos numeros: ");
            System.out.println("Digite 3 para multiplicar dos numeros: ");
            System.out.println("Digite 4 para dividir dos numeros: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: " + sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: " + restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicacion(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    division();
                    break;
                case 0:
                    System.out.println("GRACIAS POR SU VISITA");
                    interruptor = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = teclado.nextInt();
    }
    public static void main(String[] args) {
        OprecionAritmetica mivariable = new OprecionAritmetica();
        mivariable.ejecutar();
    }
}
