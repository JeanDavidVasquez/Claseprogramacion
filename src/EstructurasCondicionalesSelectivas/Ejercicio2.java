package EstructurasCondicionalesSelectivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercisio 2");
        System.out.println("INGRESE LO PEDIDO EN NUMEROS");
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int ano = sc.nextInt();

        if (ano >= 1990 && ano <= 2010) {
            if (mes >= 01 && mes <= 12) {
                switch (mes) {
                    case 1:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;
                    case 2:
                        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
                            if (dia >= 01 && dia <= 29) {
                                System.out.println("Fecha Valida");
                            } else {
                                System.out.println("Fecha Invalida");
                            }
                        break;
                    case 3:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;
                    case 4:
                        if (dia >= 01 && dia <= 30) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;


                    case 5:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 6:
                        if (dia >= 01 && dia <= 30) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 7:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 8:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 9:
                        if (dia >= 01 && dia <= 30) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 10:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 11:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                    case 12:
                        if (dia >= 01 && dia <= 31) {
                            System.out.println("Fecha valida");
                        } else {
                            System.out.println("Fecha invalida");
                        }
                        break;

                }
            }
        }else{
            System.out.println("Fecha invalida");
        }
    }
}

