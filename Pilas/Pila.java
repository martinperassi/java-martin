package Pilas;


/*
 * Pila (Stack)
 * estructura de datos que nos permite agregar o eliminar datos, el metodo de acceso de esta pila es el LIFO (LAST IN FIRST OUT), ultimo que entra sera el primero en salir,
 * vamos a trabajar las pilas mediante arreglos o vectores, pero se puede trabajar de otras maneras(List, ArrayList, etc).
 * --> Las pilas almacenas datos homogeneos, osea, datos de la misma variable(enteros, cadenas, caracteres o booleanos).
 * 
 * Una pila esta compuesta por 3 atributos:
 * 
 * 1.El vector
 * 2.El numero maximo de elementos que contendra en vector
 * 3.Una cima
 * 
 * Metodos:
 * 1.meter (entero elem) --> nos permite meter un elemento
 * 2.sacar --> nos permite sacar un elemento
 * 3.esta llena --> verifica si la pila esta llena
 * 4.esta vacia --> verifica si la pila esta vacia
 */

public class Pila {
    //ATRIBUTOS
    private int[] numeros;
    private int max_elementos = 30;
    private int cima;

    //CONSTRUCTOR
    Pila(){
        this.numeros = new int[max_elementos];
        this.cima = -1;
    }

    //METODOS
    //estaVacia --> si la pila esta vacia, entonces cima == -1 tiene que devolver true
    public boolean estaVacia(){
        return(cima == -1);
    }

    //estaLlena --> si la pila esta llena, osea, se supero la capacidad maxima de elementos que puede albergar el vector es sobrepasada, estaLlena devolvera true
    public boolean estaLlena(){
        return(cima == max_elementos - 1);
    }

    //meter
    public void meter(int num){
        cima++;
        numeros[cima] = num;
        if (estaLlena()) {
            System.out.println("Error: La pila está llena, no se puede meter el elemento " + num);
        } else {
            cima++;
            numeros[cima] = num;
        }
    }//--> primero aumentamos en 1 el valor de cima para que podamos arrancar a ingresar desde el indice 0 del vector numeros, ya que no existe el indice -1 en un vector 
    //     y luego almacenamos en el indice 0 el numero ingresado y asi sucesivamente.

    //sacar
    int aux = 0;
    public int sacar(){
        if(!this.estaVacia()){
            aux = numeros[cima];
            cima--;
            return aux;
        }else{
            System.out.println("sd");
        }


        // int aux;
        // aux = numeros[cima];
        // cima = cima -1;
        // return aux;
    }
    // -->creamos una variable auxiliar para utilizar posteriormente.
    // -->a esa variable aux le almacenamos el valor que tenga la cima
    // -->cima disminuye en 1 por que sacamos un elemento del vector
    // -->devolvemos el valor que almacenamos en la variable aux
}
