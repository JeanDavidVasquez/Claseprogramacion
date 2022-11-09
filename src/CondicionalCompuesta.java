import java.util.Scanner;

public class CondicionalCompuesta {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Determinar mayoria de Edad");
        System.out.println("Ingrese Edad");
        int edad=teclado.nextInt();
        if (edad>0 && edad<18) {
            System.out.println("Eres menor de Edad");
        }else if (edad>=18 && edad<65) {
            System.out.println("Eres mayor de Edad");
        }else if (edad>=65 && edad<100) {
            System.out.println("Eres de la tercera Edad");
        }else if (edad>=100 && edad<150) {
            System.out.println("No eres humano");
        }

        }

    }