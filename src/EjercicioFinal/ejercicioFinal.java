package EjercicioFinal;


import java.util.Calendar;
import java.util.Scanner;
public class ejercicioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (en numeros)");
        System.out.println("Año, mes, dia (en orden)");
        int ano = sc.nextInt();int mes = sc.nextInt();int dia = sc.nextInt();int bis = 0;
        System.out.println("Ingrese la fecha actual");
        int ano1 = sc.nextInt();int mes1 = sc.nextInt();int dia1 = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            bis = 1;
        }
        Calendar calendario = Calendar.getInstance();
        int hora;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        if (ano >= 1900 && ano <= 2022 && ano1>=1900 && ano1<=2022) {
            if (mes >= 01 && mes <= 12 && mes1<=12 && mes1>=1) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 01 && dia <= 31 && dia1<=31 && dia1>=01) {
                        int dias = dia1 - dia;int meses = mes1 - mes;int anos = ano1 - ano;
                        if (dias<=0){
                            dias= (dias)*(-1);
                        }
                        if(meses<=0){
                            meses=(meses)*(-1);
                        }
                        System.out.println("Tienes " + anos + " con " + meses + " meses " + " y " + dias + " dias " + hora + "horas");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 01 && dia <= 30 && dia1<=31 && dia1>=01) {
                        int dias = dia1 - dia;int meses = mes1 - mes;int anos = ano1 - ano;
                        if (dias<=0){
                            dias= (dias)*(-1);
                        }
                        if(meses<=0){
                            meses=(meses)*(-1);
                        }
                        System.out.println("Tienes " + anos + " con " + meses + " meses " + " y " + dias + " dias " + hora + "horas");
                    }
                } else if (mes == 2 && bis == 0) {
                    if (dia >= 01 && dia <= 28 && dia1<=31 && dia1>=01) {
                        int dias = dia1 - dia;int meses = mes1 - mes;int anos = ano1 - ano;
                        if (dias<=0){
                            dias= (dias)*(-1);
                        }
                        if(meses<=0){
                            meses=(meses)*(-1);
                        }
                        System.out.println("Tienes " + anos + " con " + meses + " meses " + " y " + dias + " dias " + hora + "horas");
                    }
                } else if (mes == 2 && bis == 1) {
                    if (dia >= 01 && dia <= 29 && dia1<=31 && dia1>=01) {
                        int dias = dia1 - dia;int meses = mes1 - mes;int anos = ano1 - ano;
                        if (dias<=0){
                            dias= (dias)*(-1);
                        }
                        if(meses<=0){
                            meses=(meses)*(-1);
                        }
                        System.out.println("Tienes " + anos + " con " + meses + " meses " + " y " + dias + " dias " + hora + "horas");
                    }
                } else {
                    System.out.println("Mes invalido");
                }
            } else {
                System.out.println("Año invalido");
            }
        }
    }
}
