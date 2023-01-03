package AlgotOrdenamiento;

public class AlgotInsercion {
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
            int pos=indice;
            int aux= arreglo[indice];
            while ((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio)/1000);
        System.out.println(tiempo+"En Segundos");
    }
}

