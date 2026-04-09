package EjercicioHerencia1;

public class Economico extends Boleto{

    Economico(String origen, String destino, String nombre, int dni, String fechaViaje, double importe) {
        super(origen, destino, nombre, dni, fechaViaje, importe);
    }

    @Override
    public void cambiarFecha(String nuevaFecha){
        System.out.println("La clase economica no permite modificaciones de fechas.");

    }

    @Override
    public void cambiarDestino(String nuevoDestino){
        System.out.println("La clase economica no permite modificaciones de destinos.");

    }

}
