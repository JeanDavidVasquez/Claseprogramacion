package Semana2;

public class CuadradoArreglo {
    public static void main(String[] args) {
        int numeros []= {2,3,5,7,9,11,13};
        int numeros_cuadrado []= new int [numeros.length];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros_cuadrado[indice]=numeros[indice]*numeros[indice];
        }
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros_cuadrado[indice]);
        }
    }
}
