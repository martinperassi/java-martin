package Colas.Colas;

public class ColaInt {
    //ATRIBUTOS
    private int maxElementos = 5;
    private int [] elementos;
    private int ultimo;

    //CONSTRUCTOR
    ColaInt(){
        elementos = new int[maxElementos];
        ultimo = -1;
    }
    //ultimo representaria a cima en pilas.

    //Metodos
    public boolean estaVacia(){
        return ultimo == -1;    
    }

    public boolean estaLlena(){
        return ultimo == maxElementos - 1;
    }

    public int meter(int elem){
        if(!estaLlena()){
            ultimo++;
            elementos[ultimo] = elem; 
            return elem;
        }else{
            return -1;
        }
    }

    public int sacar(){
        int aux = elementos[0];
        for(int i = 0; i < ultimo; i++){
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
        return aux;
    }

    public int verElementos(){
        return ultimo + 1;
    }


    public void eliminarRepetidos() {
        for(int i = 0; i <= ultimo; i++){
            int actual = elementos[i];

            // comparar con todos los que están adelante
            for(int j = i + 1; j <= ultimo; j++){
                if(elementos[j] == actual){
                    // correr a la izquierda desde j
                    for(int k = j; k < ultimo; k++){
                        elementos[k] = elementos[k+1];
                    }
                    ultimo--;  
                    j--;       // volvemos una posición para revisar el nuevo elemento en j
                }
            }
        }
    }
}
