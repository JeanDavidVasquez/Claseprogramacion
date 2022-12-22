package Semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[] = new String[100];
        int edad[] = new int[100];
        String uni[] = new String[100];
        boolean interruptor = true;
        int indice = 0;
        while (interruptor == true) {
            System.out.println("INGRESE DATOS DEL ESTUANTE");
            System.out.println("Ingrese su nombre: ");
            nombres[indice] = teclado.nextLine();
            System.out.println("Ingrese Edad: ");
            edad [indice] = teclado.nextInt();
            teclado.nextLine();//para leer el enter despues de la ing. edad
            System.out.println("Ingrese universidad: ");
            uni[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante si/no");
            String resp = teclado.nextLine().toLowerCase();//en minusculas
            if(resp.equals("no"))
                interruptor = false;//finalizamos ciclo while
        }
        //ordenar arreglo por edad
        for (int indice2 = 1; indice2 <= edad.length-1; indice2++) {
            for (int elemento = 0; elemento <= edad.length-2; elemento++) {
                //Verificar si realizamos intercambio
                if(edad[elemento]>edad[elemento+1]){
                    int aux = edad[elemento];
                    edad[elemento] = edad[elemento+1];
                    edad[elemento+1] = aux;
                    //proceso de intercambio arreglos nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento] = nombres[elemento+1];
                    nombres[elemento+1] = aux_n;
                    //proceso de intercambio arreglos universidades
                    String aux_u = uni[elemento];
                    uni[elemento] = uni[elemento+1];
                    uni[elemento+1] = aux_u;
                }
            }
        }
        //presentar datos de los estudiantes
        for (int pos = 0; pos < nombres.length; pos++) {
                if (nombres[pos] !=null){
            System.out.println("Nombres: " + nombres[pos]);
            System.out.println("Edad: " + edad[pos]);
            System.out.println("Universidades: " + uni[pos]);
            }
        }
    }
}