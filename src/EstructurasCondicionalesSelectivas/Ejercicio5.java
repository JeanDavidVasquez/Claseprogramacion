package EstructurasCondicionalesSelectivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los 3 valores");
        System.out.println("Ingrese valor 1: ");
        int val1 = teclado.nextInt();
        System.out.println("Ingrese valor 2: ");
        int val2 = teclado.nextInt();
        System.out.println("Ingrese valor 3: ");
        int val3 = teclado.nextInt();
        int hipotenusa = (val1 * val2);
        int val4 = (val3 * val3);
        if (hipotenusa == val4){
            System.out.println("Es un triangulo rectangulo");
        }else
            System.out.println("No es un triangulo rectangulo");
        }


    }

