package Pilas.ParcialPilas;


// CONSIGNA
// 1.Crear un metodo dentro de la clase pila de enteros, que reciba otra pila de enteros p2 tambien, calcule y retorne verdadero si la pila tiene mas elementos pares que la pila p2
// que se envia por parametro o falso si la p2 tiene mas elementos pares. Las pilas deben quedar como estaban originalmente;

// ejemplo del metodo: public boolean masElementosPares(Pila p2){

// }

// 2. Desde el metodo main, dadas 2 pilas de caracteres p1 y p2 de igual cantidad de elementos, generar una cola de caracteres Q1 resultante de intercalar }
// los elementos de ambas colas, de modo que las pilas queden como estaban originalmente.
public class Main {
    public static void main(String[]args){
        Pila p1 = new Pila();

        for(int i = 0; i < 5; i++){
            int x;
            x = p1.meter(i);
            System.out.println(i);
        }

        while(!p1.estaVacia()){
            int x;
            x = p1.sacar();
            System.out.println(x);
        }


    }
}
