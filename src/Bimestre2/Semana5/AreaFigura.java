package Semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("INGRESE UN NUMERO PARA CADA OPCION");
            System.out.println("Ingrese 1 para obtener el area de una circuferencia");
            System.out.println("Ingrese 2 para obetener el area de un cuadrado");
            System.out.println("Ingrese 3 para obtener el area de un cilindro");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("INGRESE EL RADIO DE UNA CIRCUFERENCIA");
                    double circun = sc.nextDouble();
                    double resultado1 = circunfrecia(circun);
                    System.out.println("El area de la circuferencia es: " + resultado1);
                    break;
                case 2:
                    System.out.println("INGRESE EL LADO DE UN CUADRADO");
                    double lado = sc.nextDouble();
                    double resul2 = cuadrado(lado);
                    System.out.println("El area del cuadrado es: " + resul2);
                    break;
                case 3:
                    System.out.println("INGRESE EL RADIO DE UN CILINDRO");
                    double radi2 = sc.nextDouble();
                    System.out.println("Ingrese la altura del cilindro");
                    double altura = sc.nextDouble();
                    double result3 = cilindro(radi2, altura);
                    System.out.println("El area del cilindro es:" + result3);
            }
        }
    }

    public static double circunfrecia(double radio) {
        double area = (radio * radio) * 3.1416;
        return area;
    }

    public static double cuadrado(double lado) {
        double area2 = lado * lado;
        return area2;
    }

    public static double cilindro(double radio, double altura) {
        double area3 = 2 * 3.1416 * radio * (radio * altura);
        return area3;
    }
}