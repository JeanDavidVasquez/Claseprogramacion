package EstructurasCondicionalesSelectivas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tiempo");
        int tiempo = teclado.nextInt();
        if (tiempo <= 35){
            double presion = 0.46 * tiempo;
            System.out.println("La presion es: " + presion);
        }else if (tiempo >= 35){
            double presion = 0.19 * tiempo + 9.45;
            System.out.println("Correcto la presion es " + presion);
        }
        }
    }

