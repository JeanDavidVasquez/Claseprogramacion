package Semana6;

import java.util.Scanner;

public class Ejercicio2 {
    double hipotenusa;
    double s_ab;
    public void hip (double a, double b){
        s_ab=(a*a)+(b*b);
        hipotenusa=hipotenusa*hipotenusa;
    }
    public void Indentificar(){
        if (hipotenusa == s_ab){
            System.out.println("TRIANGULO RECTANGULO");
        }else if(hipotenusa<s_ab){
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (hipotenusa>s_ab) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
    }
    public void resultado(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CATETO 1");
        double c1 = teclado.nextDouble();
        System.out.println("CATETO 2");
        double c2 = teclado.nextDouble();
        System.out.println("CATETO 3");
        hipotenusa = teclado.nextDouble();
        hip(c1,c2);
        Indentificar();
    }
    public static void main(String[] args) {
        Ejercicio2 var = new Ejercicio2();
        var.resultado();
    }
}

