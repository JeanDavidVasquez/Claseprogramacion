package EstructurasCondicionalesSelectivas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println("El numero 1 es mayor");
        } else {
            System.out.println("El numero 1 es menor");
        }
    }
}
