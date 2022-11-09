import java.util.Scanner;

public class CondicionalDoble {
        public static void main(String[] args) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("Determinar mayoria de Edad");
            System.out.println("Ingrese Edad");
            int edad=teclado.nextInt();
            boolean evaluacion=(edad>=18);
            if (evaluacion) {
                System.out.println("Eres mayor de edad");
                System.out.println("Estas listo para tu vida adulta");
            }else {
                System.out.println("Eres menor de Edad");
            }
    }
}
