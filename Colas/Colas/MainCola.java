package Colas.Colas;

import PracPar2Colas.Basico.Primer.Cola;

public class MainCola {
    public static void main(String[] args) {
        // ColaInt cola = new ColaInt();

        // cola.meter(45);
        // cola.meter(1);
        // cola.meter(2);
        // cola.meter(3);
        // cola.meter(4);

        // // while(!cola.estaVacia()){
        // //     int y = cola.sacar();
        // //     System.out.println(y);
        // // }

        // System.out.println(cola.sacar());

        //Punto1

        // ColaInt cola = new ColaInt();
        // int x = 0;
        // int y = 1;
        // cola.meter(x);
        // cola.meter(y);
        // y = cola.sacar();
        // int z = y + 5;
        // while (!cola.estaVacia()) {
        //     z = cola.sacar();
        //     System.out.println(z);
        // }

        //Punto2

        // Pila pila = new Pila();
        // ColaInt cola = new ColaInt();

        // int x = 0;
        // int y = 1;
        // int z = x + y;

        // while(z < 10){
        //     if((z % 2) == 0){
        //         pila.meter(z);
        //     }else{
        //         cola.meter(z);
        //     }
        //     x = y;
        //     y = z;
        //     z = x + y;
        // }

        // System.out.println("Elementos de la Pila");
        // while(!pila.estaVacia()){
        //     int aux;
        //     aux = pila.sacar();
        //     System.out.println(aux);
        // }

        // System.out.println("elementos de la cola");
        // while(!cola.estaVacia()){
        //     int aux;
        //     aux = cola.sacar();
        //     System.out.println(aux);
        // }

        //PUNTO 3

        // 3. Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación 
        // Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos)


        //PUNTO 4

        // 4. En base a la implementación Frente y Final movible, escribir un método contar que devuelva la 
        // cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo, 
        // no debería manejarse como tal.


        // ColaInt cola = new ColaInt();
        // System.out.println(cola.meter(0));
        // System.out.println(cola.meter(1));
        // System.out.println(cola.meter(2));
        // System.out.println(cola.meter(3));

        // System.out.print("Cantidad de elementos en cola: ");
        // System.out.println(cola.verElementos());

        //PUNTO 5

        // 5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola.

        // ColaInt cola = new ColaInt();

        // System.out.println(cola.meter(0));
        // System.out.println(cola.meter(1));
        // System.out.println(cola.meter(2));
        // System.out.println(cola.meter(3));
        // System.out.println(cola.meter(0));
        // System.out.println();

        // cola.eliminarRepetidos();

        // while(!cola.estaVacia()){
        //     int aux;
        //     aux = cola.sacar();
        //     System.out.println(aux);
        // }

        //PUNTO 7
        // 7. Se tiene una pila de enteros positivos. Con las operaciones básicas de pilas y colas, escribir un 
        // programa que coloque todos los elementos pares de la pila en la cola.

        // Pila pila = new Pila();
        // ColaInt cola = new ColaInt();

        // System.out.println("Elementos de la Pila: ");
        // System.out.println(pila.meter(10));
        // System.out.println(pila.meter(41));
        // System.out.println(pila.meter(455));
        // System.out.println(pila.meter(2));
        // System.out.println(pila.meter(23));
        // System.out.println();

        // while(!pila.estaVacia()){
        //     int aux;
        //     aux = pila.sacar();
        //     if((aux % 2) == 0){
        //         cola.meter(aux);
        //     }
        // }

        // System.out.println("Elementos pares que se almacenaron en la cola: ");  
        // while(!cola.estaVacia()){
        //     int aux;
        //     aux = cola.sacar();
        //     System.out.println(aux);
        // }      

        //PUNTO 8
        System.out.println("hola como estas");
        System.out.println("fede que tal como va");



    }

}
