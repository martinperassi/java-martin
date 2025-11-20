package Parciales;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();
        Pila pila2 = new Pila();

        pila.meter(10);
        pila.meter(3);
        pila.meter(4);
        pila.meter(65);
        pila.meter(303);
        pila.meter(103);

        pila2.meter(40);
        pila2.meter(5);
        pila2.meter(3);
        pila2.meter(9000);
        pila2.meter(1);
        pila2.meter(14);

        System.out.println(pila.compararPares(pila2));

        PilaCaracteres p1 = new PilaCaracteres();
        PilaCaracteres p2 = new PilaCaracteres();

        System.out.println(p1.meter('a'));
        System.out.println(p1.meter('s'));
        System.out.println(p1.meter('f'));

        System.out.println(p1.meter('e'));
        System.out.println(p1.meter('i'));
        System.out.println(p1.meter('o'));
        System.out.println();

        Cola cola = new Cola();
        while(!cola.estaLlena()){
            char aux1,aux2;
                aux1 = p1.sacar();
                aux2 = p2.sacar();
                cola.meter(aux1);
                cola.meter(aux2);
                System.out.println(aux1);
                System.out.println(aux2);
        }





    }
}
