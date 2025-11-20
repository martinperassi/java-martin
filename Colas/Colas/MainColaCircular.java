package Colas.Colas;

public class MainColaCircular {
    public static void main(String[] args){
        ColaCircular cola = new ColaCircular();

        System.out.println("Insertando 4 elementos...");
            cola.meter(10);
            cola.meter(20);
            cola.meter(30);
            cola.meter(40);

        System.out.println("Borrando 2 elementos:");
        System.out.println(cola.sacar());
        System.out.println(cola.sacar());

        System.out.println("Insertando 3 elementos nuevos...");
            cola.meter(50);
            cola.meter(60);
            cola.meter(70);

        System.out.println("Vaciando la cola:");
            while (!cola.estaVacia()) {
                System.out.println(cola.sacar());
            }
    }
}
