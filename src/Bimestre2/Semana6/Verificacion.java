package Semana6;

/**
 * Programa para verificar mediante metodos si un numero es primo o si es par o impar
 */
public class Verificacion {

    public boolean verificar_primo(int num_a_verificar) {
        int cont_divisores = 0;
        for (int cont = 1; cont <= num_a_verificar; cont++) {
            if (num_a_verificar % cont == 0)//detectamos un nuevo divisor
                cont_divisores++;
        }
        if (cont_divisores == 2)//verificamos si es primo
            return true;
        else
            return false;
    }
    public boolean verificar_par(int num){
        if (num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        if (mivariable.verificar_primo(5))
            System.out.println("si es primo");
        else
            System.out.println("no es primo");
        Verificacion verif= new Verificacion();
        if (verif.verificar_par(5)==true){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
