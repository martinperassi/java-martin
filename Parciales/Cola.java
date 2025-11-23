package Parciales;

public class Cola {
    private char [] elementos;
    private int maxElementos = 6;
    private int ultimo;

    Cola(){
        this.elementos = new char[maxElementos];
        ultimo = -1;
    }

    public boolean estaVacia(){
        return ultimo == -1;
    }

    public boolean estaLlena(){
        return ultimo == maxElementos -1;
    }

    public char meter(char elem){
        if(!estaLlena()){
            ultimo++;
            elementos[ultimo] = elem;
            return elem;
        }else{
            return '!';    
        }
    }

    public char sacar(){
        if(!estaVacia()){
            char aux = elementos[0];
            for(int i = 0; i < ultimo; i++){
                elementos[i] = elementos[i + 1];
            }
            ultimo--;
            return aux;
        }else{
            return '!';
        }
    }


}
