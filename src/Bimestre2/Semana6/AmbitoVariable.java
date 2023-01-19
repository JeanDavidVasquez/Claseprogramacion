package Semana6;

import javax.naming.Binding;

public class AmbitoVariable {
    static int numero = 10; //creacion de variable global

    public static void cambiar_valor(){
        numero = numero +15;
        int valor = 5;
    }
    public  void cambiar_valor(int numero){
        this.numero = this.numero + 50;
    }

    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El nuevo valor del numero: "+ numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiar_valor(100);
        System.out.println("El nuevo valor del numero: "+ numero);
        int indice =0;
        for (indice = 0; indice < 5; indice++) {
            System.out.println("repeticion"+ indice);
        }
        System.out.println("El valor final del indice: "+ indice);
    }
}
