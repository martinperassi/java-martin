package Recursividad;

public class Imprimir {
    public void repeticion(int x){
        if( x <= 5){
            System.out.print(x + " ");
            repeticion(x + 1);    
        }
    }
}
