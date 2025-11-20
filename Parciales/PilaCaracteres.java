package Parciales;

public class PilaCaracteres {
    private char [] elementos;
    private int maxElementos = 3;
    private int cima;

    PilaCaracteres(){
        this.elementos = new char[maxElementos];
        cima = -1;
    }

    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == maxElementos - 1;
    }

    public char meter(char caracter){
        if(!estaLlena()){
            cima++;
            elementos[cima] = caracter;
            return caracter;
        }else{
            return '!';    
        }
    }

    public char sacar(){
        if(!estaVacia()){
            char aux = elementos[cima];
            cima--;
            return aux;
        }else{
            return '!';
        }
    }

}
