package EjercicioHerencia1;

public class Boleto {

    private String origen;
    private String destino;
    private String nombre;
    private int dni;
    private String fechaViaje;
    private double importe;

    Boleto(String origen, String destino, String nombre, int dni, String fechaViaje, double importe){
        this.origen = origen;
        this.destino = destino;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaViaje = fechaViaje;
        this.importe = importe;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String nuevoOrigen){
        this.origen = nuevoOrigen;
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String nuevoDestino){
        this.destino = nuevoDestino;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int nuevoDni){
        this.dni = nuevoDni;
    }

    public String getFechaViaje(){
        return fechaViaje;
    }

    public void setFechaViaje(String nuevaFechaViaje){
        this.fechaViaje = nuevaFechaViaje;
    }

    public double getImporte(){
        return importe;
    }

    public void setImporte(double nuevoImporte){
        this.importe = nuevoImporte;
    }

    //metodo para cambiar fechas
    public void cambiarFecha(String nuevaFecha) {

    }

    //metodo para cambiar destinos
    public void cambiarDestino(String nuevoDestino){

    }

    @Override
    public String toString(){
        return "Origen: " + this.getOrigen() + "\nDestino: " + this.getDestino() + "\nNombre: " + this.getNombre() + "\nDni: " + this.getDni() + "\nFecha de viaje: " + this.fechaViaje + "\nImporte: " + this.getImporte();
    }


}
