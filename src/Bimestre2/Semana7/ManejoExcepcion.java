package Semana7;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAMA PARA REALIZAR LA DIVISION ENTRE DOS NUMEROS
 */
public class ManejoExcepcion {
    //creacion de variables globales
    double n1;
    double n2;

    public static void main(String[] args) {
        ManejoExcepcion mivar = new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("RESULTADO = " + dividir() );
    }
    public void ingresar_datos () {
        //El bloque try nos ayuda a captar o detectar si ocurre la excepcion
        try {//este codigo tiene la posibilidad de presentar una excepcion
            Scanner teclado = new Scanner(System.in);
            System.out.println("INGRESE EL NUMERADOR");
            n1 = teclado.nextDouble();
            System.out.println("INGRESE EL DENOMINADOR");
            n2 = teclado.nextDouble();
        } catch (Exception error_de_teclado) {
            System.out.println("Manejo de la exepcion con catch");
            System.out.println(error_de_teclado.getMessage());
        }
    }
    public double dividir (){
        double resultado = 0;
        try {
            //codigo en el que posiblemente puede ocurrir una exepcion
            resultado = n1 / n2;
            return resultado;
        }catch (Exception error){
            //este codigo se ejecuta solo si ocurre una execpcion
            System.out.println("Error de tipo aritmetico");
            System.out.println(error.getMessage());
        }finally {
            //este codigo se ejecuta ocurre o no la excepcion
            System.out.println("Ingreso a finally");
        }
        return resultado;
    }
}
