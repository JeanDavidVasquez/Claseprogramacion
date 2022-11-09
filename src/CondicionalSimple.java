import java.util.Scanner;

/**
 * Programa para determinar si una persona es mayor de Edad
 */

public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Determinar mayoria de Edad");
        System.out.println("Ingrese Edad");
        int edad=teclado.nextInt();
        boolean evaluacion=(edad>=18);
        if (evaluacion) {
            System.out.println("Eres mayor de edad");
            System.out.println("Estas listo para tu vida adulta");
        }

    }
}
