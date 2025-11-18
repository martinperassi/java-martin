package PracPar2Colas.Basico.Primer;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Cola c1 = new Cola();
        c1.meter(1);
        c1.meter(2);
        c1.meter(3);
        //c1.meter(4);
        //c1.meter(5);
        
        System.out.println("Elementos en orden de salida:");

        for(int i=0;i<5;i++){
            System.out.println("posicion: " + i + " valor: " + c1.sacar());
        }

        System.out.println(c1.verFrente());
        
    }
}
