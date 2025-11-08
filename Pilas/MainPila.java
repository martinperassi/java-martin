package Pilas;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println(pila.estaVacia());//devuelve true si la pila esta vacia
        pila.meter(10);
        pila.meter(4);
        pila.meter(5);
        pila.meter(6);
        pila.meter(17);

        int elemento;

        if(!pila.estaVacia()){
            elemento = pila.sacar();
            System.out.println("elemento sacado: " + elemento);
        }else{
            System.out.println("error, la pila esta vacia, por lo tanto no se puede sacar un elemento.");
        }
        System.out.println(pila.estaVacia());// --> esta vacia (dara true)
        System.out.println(pila.estaLlena());// --> no esta llena (dara false)


        System.out.println("PUNTO 1:");
        int x = 3;
        int y = 5;
        int z = 2;

        Pila pila1 = new Pila();

        


    }
}
