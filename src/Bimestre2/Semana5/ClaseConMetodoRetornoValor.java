package Semana5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ClaseConMetodoRetornoValor {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("PROGRAMA PARA SUMAR DOS NUMEROS");
            System.out.println("Ingrese el primer valor: ");
            int num1 = teclado.nextInt();
            System.out.println("Ingrese el segundo valor: ");
            int num2 = teclado.nextInt();
            int resultado = sumar(num1,num2, 5);//llamamos metodo y recibimos el valor
            System.out.println("LA SUMA ES: "+ resultado);
            //sumar_dos_numeros (num1, num2 );
            //OBTENER EL PROMEDIO DE LOS NUMEROS INGRESADOS
            double promedio = obtener_promedio(resultado, 2 );
            System.out.println("EL PROMEDIO DE LOS NUMEROS ES: " + promedio);
        }

        /**
         * Este método reliza la suma de dos numeros enteros
         * @param n1
         * @param n2
         * @return
         */
        public static int sumar(int n1, int n2){
            int resultado  = n1 + n2;
            return n1;
        }

        /**
         * Sumar tres numeros enteros
         * @param n1
         * @param n2
         * @param n3
         */

        public static int sumar(int n1, int n2, int n3){
            int resultado = n1 + n2 +n3 ;
            return resultado;

        }

        /**
         * Metdod para obtener el promedio de la suma de valores
         * @param suma_total
         * @param cantidad_num
         * @return
         */
        public static double obtener_promedio(int suma_total , int cantidad_num){
            double promedio = (double) suma_total / (double) cantidad_num;
            return  promedio;

        }
    }