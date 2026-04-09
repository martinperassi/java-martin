package EjercicioHerenciaYPolimorfismo;

public class Frescos extends Producto{

    private double peso;

    public Frescos(String nombre,String fEnvasado, String fCaducidad, int nLote, String pOrigen, double peso){
        super(nombre, fEnvasado, fCaducidad, nLote, pOrigen);
        this.peso = peso;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "Peso: " + this.peso + "\n";
    }

    public void setPeso(double nuevoPeso){
        this.peso = nuevoPeso;
    }

    public double getPeso(double peso){
        return this.peso;
    }



}
