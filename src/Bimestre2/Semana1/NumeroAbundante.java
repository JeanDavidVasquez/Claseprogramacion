package Bimestre2.Semana1;

import java.util.Scanner;

public class NumeroAbundante {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero= teclado.nextInt();
        int contador=1;
        int suma_divisores=0;
        while (contador<numero){
            if (numero%contador==0){
                suma_divisores=suma_divisores+contador;
            }
            contador++;
        }
        if (suma_divisores>numero){
            System.out.println("El numero es abundante");
        } else {
            System.out.println("El numero no es abundante");
        }


    }
}

