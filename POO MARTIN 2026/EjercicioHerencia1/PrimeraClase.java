package EjercicioHerencia1;

public class PrimeraClase extends Boleto{

    PrimeraClase(String origen, String destino, String nombre, int dni, String fechaViaje, double importe) {
        super(origen, destino, nombre, dni, fechaViaje, importe);
    }

    //metodo para cambiar fechas
    @Override   
    public void cambiarFecha(String nuevaFecha){
        this.setFechaViaje(nuevaFecha);
        System.out.println("Nueva fecha establecida: " + this.getFechaViaje());
    }

    //metodo para cambiar destinos
    @Override
    public void cambiarDestino(String nuevoDestino){
        this.setDestino(nuevoDestino);
        System.out.println("Nueva destino establecido: " + this.getDestino());

    }
}
