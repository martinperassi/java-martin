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
        System.out.println();

        //creamos las pilas de caracteres y sus auxiliares para poder devolverlas a su estado original.
        PilaCaracteres p1 = new PilaCaracteres();
        PilaCaracteres p2 = new PilaCaracteres();
        PilaCaracteres p1Aux = new PilaCaracteres();
        PilaCaracteres p2Aux = new PilaCaracteres();

        System.out.println(p1.meter('a'));
        System.out.println(p1.meter('s'));
        System.out.println(p1.meter('f'));
        System.out.println();

        System.out.println(p2.meter('e'));
        System.out.println(p2.meter('i'));
        System.out.println(p2.meter('o'));
        System.out.println();

        //creamos la cola de caracteres 
        Cola cola = new Cola();
        while(!p1.estaVacia() && !p2.estaVacia()){
            char aux1 = p1.sacar();
            char aux2 = p2.sacar();
            cola.meter(aux1);
            cola.meter(aux2);
            p1Aux.meter(aux1);
            p2Aux.meter(aux2);
        }

        //restauramos pila1
        while(!p1Aux.estaVacia()){
            char aux = p1Aux.sacar();
            p1.meter(aux);
        }
        //restauramos pila2
        while(!p2Aux.estaVacia()){
            char aux = p2Aux.sacar();
            p2.meter(aux);
        }

        System.out.println("Contenido de la cola: ");
        while(!cola.estaVacia()){
            char aux = cola.sacar();
            System.out.println(aux);
        }






    }
}
