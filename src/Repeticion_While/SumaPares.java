package Repeticion_While;

/**
 * Programa para realizar la suma de los numeros pares que existen del 1 al 100
 */
public class SumaPares {
    public static void main(String[] args) {
        System.out.println("SUMA DE NUMEROS PARES DEL 1 AL 100");
        int suma_pares = 0;
        int num = 1;
        while (num <=100){
            if (num%2==0){
                suma_pares = suma_pares + num;
            }
            num =num +1;
        }
        System.out.println("La suma de los numeros pares es: "+ suma_pares);
    }
}
