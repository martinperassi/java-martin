package EjercicioHerencia1;

public class Turista extends Boleto{
    
    public Turista(String origen, String destino, String nombre, int dni, String fechaViaje, double importe) {
        super(origen, destino, nombre, dni, fechaViaje, importe);
    }

    //@Override
    public void cambiarFecha(String nuevaFecha){
        this.setFechaViaje(nuevaFecha);

        this.setImporte(this.getImporte() + 25000);

        System.out.println("nueva Fecha de viaje: " + nuevaFecha + ", tarifa agregada por modificacion, tarifa final: " + this.getImporte());

    }

    public void cambiarDestino(String nuevoDestino){
        this.setDestino(nuevoDestino);

        this.setImporte(this.getImporte() + 25000);

        System.out.println("nuevo destino: " + nuevoDestino + ", tarifa agregada por modificacion, tarifa final: " + this.getImporte());

    }

}
