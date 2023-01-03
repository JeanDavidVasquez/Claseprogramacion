package AlgotOrdenamiento;

public class AlgotSeleccion {
    public static void main(String[] args) throws InterruptedException{
        int arreglo[]=new int[1000];
        int indiceelem=0;
        for (int indice = 1000; indice > 0; indice--) {
            arreglo[indiceelem]=indice;
            indiceelem++;
        }
        long inicio= System.currentTimeMillis();
        Thread.sleep(2000);
        for (int indice = 0; indice < arreglo.length; indice++) {
            int min=indice;
            for (int indice2 = indice+1; indice2 < arreglo.length; indice2++) {
                if(arreglo[indice2]<arreglo[min]){
                    min=indice2;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice]=arreglo[min];
            arreglo[min]=aux;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio)/1000);
        System.out.println(tiempo+"En Segundos");
    }
}
