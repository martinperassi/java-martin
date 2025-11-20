package Parciales;

public class Cola {
    private int [] elementos;
    private int maxElementos = 6;
    private int ultimo;

    Cola(){
        this.elementos = new int[maxElementos];
        ultimo = -1;
    }

    public boolean estaVacia(){
        return ultimo == -1;
    }

    public boolean estaLlena(){
        return ultimo == maxElementos -1;
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
        if(!estaVacia()){
            int aux = elementos[0];
            for(int i = 0; i < ultimo; i++){
                elementos[i] = elementos[i + 1];
            }
            ultimo--;
            return aux;
        }else{
            return -1;
        }
    }


}
