package Semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA OBTENER EL AREA DE FIGURAS GEOMETRICAS");
        System.out.println("Digite 1 para obtener el area de una circuferencia: ");
        System.out.println("Digite 2 para obtener el area de un cuadrado: ");
        System.out.println("Digite 2 para obtener el area de un cilindro: ");
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura (int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextInt();
                double area = obtener_area_circuferencia(radio);
                System.out.println("El area es: " +area);
        }
    }
    /**
     * Metodo para obtener el area de un circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circuferencia(double radio){
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    /**
     * Metodo para obtener el area de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }

}
