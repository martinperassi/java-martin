package Parciales;

public class Pila {
    private int [] elementos;
    private int maxElementos = 6;
    private int cima;

    Pila(){
        this.elementos = new int[maxElementos];
        cima = -1;
    }

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

    public int sacar(){
        if(!estaVacia()){
            int aux = elementos[cima];
            cima--;
            return aux;
        }else{
            return -1;
        }
    }

    int cont1, cont2 = 0;
    public boolean compararPares(Pila pila){
            while(!this.estaVacia()){
                int aux = this.sacar();
                    if((aux % 2) == 0){
                        cont1++;
                    }
            }
            while(!pila.estaVacia()){
                int aux = pila.sacar();
                    if((aux % 2) == 0){
                        cont2++;
                    }
            }
            return(cont1 > cont2);
    }


}
