package PracticaClaseVector;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Deposito productos = new Deposito();

        productos.agregarProductor(new Producto("banana"));
        productos.agregarProductor(new Producto("manzana"));
        productos.agregarProductor(new Producto("pera"));
        productos.agregarProductor(new Producto("kiwi"));

        System.out.println(productos.mostrarProductos());

        Vector <Integer> numeros = new Vector<>(null);

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        




    }
}
