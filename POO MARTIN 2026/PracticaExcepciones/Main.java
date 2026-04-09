package PracticaExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        int [] numeros = {1,2,3};

        try{
            //prueba para ver si por mas que encuentre la excepcion se puede ejecutar otro enunciado
            System.out.println("hola mundo");

            numeros[3] = 4;
            System.out.println(numeros[3]);

            //prueba para ver si por mas que encuentre la excepcion se puede ejecutar otro enunciado
            System.out.println("hola mundo");

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error! estas queriendo guardar un elemento que sobrepasa la cantidad de elementos de un vector");
        }

        System.out.println("chau mundo");


        //conclusion: 1. si tengo un enunciado antes de mi error, el enunciado se ejecuta y luego se ejecuta el catch
        //            2. si el enunciado esta despues del error, este no se ejecuta pero si se ejecuta el catch de igual forma.

        //PROBANDO CON MAS DE UN CATCH

        System.out.println("**************** OTRO CASO ******************");
        System.out.println("**************** FORMA 1 ********************");
        int [] numeros2 = new int[3];

        try{
            //nombres[4] = "juan";
            System.out.println(numeros2[3]);

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error! no existe el indice donde quieres almacenar el nombre");
        }finally{
            System.out.println("finally se ejecuta de igual manera");
        }

        System.out.println("**************** FORMA 2 ********************");
        try{
            System.out.println(numeros2[5]);
        }catch(NullPointerException ex){
            System.out.println("error! no hay nada en el indice");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error! estas buscando en un indice mayor a la cantidad de elementos del vector");
        }finally{
            System.out.println("finally se ejcuta de igual manera");
        }

        //probando otras excepciones

        Scanner scanner = new Scanner(System.in);
        
            try{
                System.out.print("ingresa un numero: ");
                int num = scanner.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Error! estas ingresando un valor que no es un numero entero!");
            }
        



    }
}
