package Colas.Colas;

public class ColaCircular{
   	// implementacion cola circular
	private final int maxcola = 5;
	private int[] elementos;
	private int frente, ultimo;
	
	public ColaCircular()
	{
		elementos = new int[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean estaVacia()
	{
		return (ultimo == frente);
	}
   
	public boolean estaLlena()
	{
		int sigUltimo = siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind)
	{
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void meter(int elem)
	{		
		ultimo = siguiente(ultimo);
		elementos[ultimo]=elem;		
	}
	
	public int sacar()
	{
		frente = siguiente(frente);
		return elementos[frente];
	}
}   


//APUNTES PERSONALES PARA ENTENDER MEJOR:
// El metodo siguiente es el mas importante para la utilizacion de colas circulares, se necesita en todos los metodos
// menos en estaVacia().

// ¿QUE HACE? 

// public int siguiente(int subind){
//     if(subind == maxcola - 1){
//         return 0;
//     }else{
//         return ++subind;
//     }
// } --> Le pasamos un numero que represente al indice que queremos ver, supongamos que el indice que queremos
//     ver es 3, si 3 es = al tamaño maximo de la cola, esta devolvera 0 y si no, esta devolvera el numero siguiente a 3, osea 4.

//     Parece inutil ahora pero mas adelante vemos que casi todos los metodos se apoyan en este metodo.
//     nota: debe ser un metodo privado ya que no lo utilizamos en el main, solo en la clase ColaCircular o como le pongamos.


// ¿QUE HACE ESTALLENA?
// -> crea una variable auxilia sigUltimo.
// -> A la variable auxiliar se le va a almacenar lo que retorne el metodo siguiente(ultimo)
// -> si siguiente(ultimo) es igual al ultimo elemento que puede almacenar la cola entonces devolvera 0, sino solo aumentara en 1 el valor de ultimo.
// -> retorna(sigUltimo == frente), si ambos son 0 significa que la cola esta llena y no se pueden almacenar mas elementos.



