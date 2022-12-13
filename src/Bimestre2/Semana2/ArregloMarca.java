package Semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehiculos y las
 * almacene en un arreglo. Finalmente el programa debe mostrar el
 * nombre de las marcas almacenadas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("Cuantas marcas de vehiculos va a ingresar: ?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n]; //creamos el arreglo con n elementos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de la marca" + (indice +1));
            String marca = teclado.nextLine();
            marcas[indice] = marca;
        }
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+ "\t");
        }
        //OPERACION DE BUSQUEDA
        System.out.println("Que nombre de marca desea buscar: ?");
        String marca_busqueda = teclado.nextLine().toLowerCase();
        System.out.println("marca buscada: "+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas [indice])){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice "+indice);
                break;
            }
        }


    }
}
