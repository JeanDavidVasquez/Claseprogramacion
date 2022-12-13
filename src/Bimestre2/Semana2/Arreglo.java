package Semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglos con valores predefinidos
        String universidades[] = {"utpl", "unl", "catolica", "espol"};
        int tan = universidades.length; //obtener el tamano del arreglo
        System.out.println("tamano del arreglo: " + tan);
        for (int indice = 0; indice < tan; indice++) {
            System.out.println(universidades[indice]);
        }
        System.out.println("\n");
        //creacion de arreglo tipo entero
        int notas[] = {7, 8, 5, 4, 10};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println(notas[indice]);
        }
        System.out.println("\n");
        //creacion de un arreglo tipo chart
        char vocales[] ={ 'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.println(vocales[indice]);
        }
        System.out.println("\n");
        //creacion de un arreglo tipo boolean
        boolean valores[] ={ true,false,true,true,false};
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice]);
        }
        System.out.println("\n");
    }
}
