package Recursividad;

public class Factorial {
    public int factorial(int x){
        if(x > 0){
            int aux = x * factorial(x - 1);
            return aux;
        }else{
            return 1;
        }
    }
}
