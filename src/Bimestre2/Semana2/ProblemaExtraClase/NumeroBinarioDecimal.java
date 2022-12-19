package ProblemaExtraClase;

import java.util.Scanner;

public class NumeroBinarioDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado_bin = 0;
        int bin[] = new int[6];
        int bina = 0;
        int acumul = 0;
        int acum=0;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        System.out.println("Ingrese el numero binario uno por uno");
        for (int indice = 0; indice < bin.length; indice++) {
            System.out.println(" ");
            int n = sc.nextInt();
            if (n == 1 || n == 0) {
                bin[indice] = n;
            } else {
                System.out.println("El numero binario no es correcto");
            }
        }
        for (int indice = 0; indice < bin.length; indice++) {

            if (bin[0] == 1 || bin[0]==0) {
                a= bin[0]*32;
            }
            if (bin[1] == 1 || bin[1]==0) {
                b= bin[1]*16;
            }
            if (bin[2] == 1 || bin[2]==0) {
                c= bin[2]*8;
            }if (bin[3] == 1 || bin[3]==0){
                d= bin[3]*4;
            }if (bin[4] == 1 || bin[4]==0){
                e= bin[4]*2;
            }if (bin[5] == 1 || bin[5]==0){
                f= bin[5]*1;
            }
        }
        int sumaletras= a+b+c+d+e+f;
        System.out.println(sumaletras);
    }
}


