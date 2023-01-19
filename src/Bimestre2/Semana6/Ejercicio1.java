package Semana6;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    static int saldo;

    public void saldo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su saldo");
    }

    public static int retirar( int cantidad_retirar) {
        if (cantidad_retirar > 0 && cantidad_retirar <= saldo) {
            saldo = saldo - cantidad_retirar;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return cantidad_retirar;
    }

    public static int depositar( int deposito) {
        if (deposito > 0) {
            saldo = saldo + deposito;
        } else {
            System.out.println("Cantidad invalida");
        }
        return deposito;
    }

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        System.out.println("Ingrese el saldo: ");
        saldo = teclado.nextInt();
        while (interruptor) {
            System.out.println("Digite 0 para salir");
            System.out.println("Digite 1 para consulta de saldo: ");
            System.out.println("Digite 2 para realizar un retiro: ");
            System.out.println("Digite 3 para realizar un deposito: ");
            int ejecutar = teclado.nextInt();
            switch (ejecutar) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de retiro: ");
                    int retiro = teclado.nextInt();
                    retirar(retiro);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de deposito: ");
                    int deposito = teclado.nextInt();
                    depositar(deposito);
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

    public static void main(String[] args) {
        ejecutar();
    }
}
