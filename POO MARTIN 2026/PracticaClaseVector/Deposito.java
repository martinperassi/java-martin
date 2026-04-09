package PracticaClaseVector;

import java.util.Vector;

public class Deposito{
    //atributos
    private Vector <Producto> productos;
    
    Deposito(){
        productos = new Vector<>();
    }

    public void agregarProductor(Producto p){
        productos.add(p);
    }

    public String mostrarProductos(){
        String resultado = "";

        for(int i = 0; i< productos.size(); i++){
            resultado += productos.get(i).getNombre() + "\n";
        }
        return resultado;
    }

    


}
