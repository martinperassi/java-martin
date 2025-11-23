package Recursividad;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imprimir objeto1 = new Imprimir();

        objeto1.repeticion(-5);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce el numero para calcular el factorial: ");
        int numero = scanner.nextInt();

        Factorial fact = new Factorial();

        System.out.println(fact.factorial(numero));


    }
}
