package EjercicioHerenciaYPolimorfismo;

public class Congelados extends Producto{
    
    private double tRecomendada;


    public Congelados(String nombre,String fEnvasado, String fCaducidad, int nLote, String pOrigen, double tRecomendada){
        super(nombre, fEnvasado, fCaducidad, nLote, pOrigen);
        this.tRecomendada = tRecomendada;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "Temperatura Recomendada: " + this.tRecomendada+ "\n";
    }

    public void setTemperaturaRecomendada(double nuevaTemperaturaRecomendada){
        this.tRecomendada = nuevaTemperaturaRecomendada;
    }

    public double getTemperaturaRecomendada(){
        return this.tRecomendada;
    }


}
