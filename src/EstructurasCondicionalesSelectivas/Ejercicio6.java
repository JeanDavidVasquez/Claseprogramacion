package EstructurasCondicionalesSelectivas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el tiempo en minutos");
        int tiempo = teclado.nextInt();
        int dia = 0;
        int hora = 0;
        int min = 0;
        while (tiempo > 0 ){
            if (tiempo >= 1148){
            dia = (dia + 1);
            tiempo = (tiempo - 1140);
        }else if (tiempo >=60) {
            hora = hora + 1;
            tiempo = tiempo - 60;
        }else {
            min = min + 1;
            tiempo = tiempo - 1;
            }
        System.out.println("Dias " +dia);
            System.out.println("Horas " +hora);
        System.out.println("Minutos " +min);
    }
    }
}

