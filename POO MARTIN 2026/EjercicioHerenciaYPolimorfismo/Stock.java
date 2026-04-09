package EjercicioHerenciaYPolimorfismo;

//esta clase es el gestor
public class Stock {
    
    Producto [] productos;
    int tamaño;
    int next; 

    Stock(int n){
        this.tamaño = n;
        productos = new Producto[n];
        next = 0;
    }

    public void agregarProducto(Producto producto){
        productos[next] = producto;
        next++;
    }

    public void mostrarStock(){
        int cuenta = 0;

        while(cuenta < next){
            System.out.println(productos[cuenta].mostrarDatos());  
            cuenta++;
        }
    }

    public void mostrarProductosDeUnPais(String pais){
        Producto aux;
        int cuenta = 0;
        System.out.println("Productos producidos en " + pais + ":");
        while(cuenta < next){
            aux = productos[cuenta];
            if(aux.getPOrigen().equals(pais)){
               System.out.println(aux.mostrarDatos());
            }
            cuenta++;
        }
        System.out.println();
    }

    public void mostrarCantidadFrescos(){
        int contador = 0;
        int cuenta = 0;
        while(cuenta < next){
            if(productos[cuenta] instanceof Frescos){
                contador++;
            }
            cuenta++;
        }
        System.out.println("Cantidad de productos frescos en stock: " + contador+ "\n");

    }

    public void mostrarRefrigeradosPorRangoDeLote(int desde, int hasta){
        int cuenta = 0;

        System.out.println("Refrigerados entre lote " + desde + " y " + hasta + ":\n");

        while(cuenta < next){
            Producto aux = productos[cuenta];
            if(aux instanceof Refrigerados &&
            aux.getNLote() >= desde &&
            aux.getNLote() <= hasta){
                System.out.println(aux.mostrarDatos());
            }
            cuenta++;
        }
    }

}
