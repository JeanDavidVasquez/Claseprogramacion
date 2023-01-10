package Semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestyra clase
        //ClaseConMetdodoSinRetornoValor llamada = new ClaseConMetdodoSinRetornoValor
        //llamada.saludar();
        saludar("Jean");
    }
    private static void saludar() {
        System.out.println("BIENVENIDOS A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    private static void saludar(String nombre) {
        System.out.println("BIENVENIDOS " + nombre + " A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    private static void saludar(String nombre, String apellido) {
        System.out.println("BIENVENIDOS " + nombre + " A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    private static void saludar(String nombre, int edad) {
        System.out.println("BIENVENIDOS " + nombre + " A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
        System.out.println("Tu edad es: " + edad);
    }
}