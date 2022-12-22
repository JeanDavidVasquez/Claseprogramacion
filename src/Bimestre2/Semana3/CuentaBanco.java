package Semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre []= {"Pablo","Ivan","Richar","Andy","David"};
        int cuenta[]={1234,4567,8910,1112,1314};
        int dinero[]={1200,5000,3000,2500,10000};
        boolean interruptor=true;
        int salida=2;
        while (interruptor){
            System.out.println("Ingrese su numero de cuenta");
            System.out.println("Recuerde que si un digito esta mal escrito su cuneta va a estar incorrecta");
            int cnum = sc.nextInt();
            for (int indi = 0; indi < cuenta.length; indi++) {
                if (cnum == cuenta[indi]) {
                    while (salida==2){
                        System.out.println("Digite 1 para realizar un deposito");
                        System.out.println("Digite 2 para realizar un retiro");
                        System.out.println("Digite  3 para consultar datos");
                        System.out.println("Digite  4 para salir del programa");
                        int opc= sc.nextInt();
                        switch (opc){
                            case 1:
                                System.out.println("Ingrese la cantidad del deposito");
                                int dep= sc.nextInt();
                                if (dep >= 0) {
                                    dinero[indi]=dinero[indi]+dep;
                                }else{
                                    System.out.println("cantidad incorrecta");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad del retiro");
                                int ret= sc.nextInt();
                                if (ret <= dinero[indi] && ret>=0) {
                                    dinero[indi]= dinero[indi]-ret;
                                }else{
                                    System.out.println("Cantidad incorrecta");
                                }
                                break;
                            case 3:
                                System.out.println("Nombre: "+ nombre[indi]);
                                System.out.println("Cuenta: "+ cuenta[indi]);
                                System.out.println("Saldo: "+ dinero[indi]);
                                break;
                            case 4:
                                salida=4;
                                System.out.println("Gracias querido usuario");
                                interruptor=false;
                                break;
                        }
                    }
                }else if(indi==5){
                    System.out.println("Numero de cuenta es Incorrecto");
                }
            }

        }
    }
}