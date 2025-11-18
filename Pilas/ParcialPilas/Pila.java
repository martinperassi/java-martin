package Pilas.ParcialPilas;

public class Pila{
    //ATRIBUTOS
    private int[] elementos;
    private int maxElementos = 5;
    private int cima;

    //CONSTRUCTOR
    Pila(){
        elementos = new int[maxElementos];
        cima = -1;
    }

    //METODOS
    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == maxElementos - 1;
    }

    public int meter(int elem){
        if(!estaLlena()){
            cima++;
            elementos[cima] = elem;
            return elem;
        }else{
            return -1;
        }
    }

    int aux = 0;
    public int sacar(){
        if(!estaVacia()){
            aux = elementos[cima];
            cima--;
            return aux;
        }else{
            return -1;
        }
    }

    public int getMaxElementos(){
        return maxElementos;
    }
}