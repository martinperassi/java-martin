package EjercicioHerenciaYPolimorfismo;

public class Refrigerados extends Producto{
    
    private int cSupervision;

    public Refrigerados(String nombre,String fEnvasado, String fCaducidad, int nLote, String pOrigen, int cSupervision){
        super(nombre, fEnvasado, fCaducidad, nLote, pOrigen);
        this.cSupervision = cSupervision;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "Codigo de Organismo de Supervision Alimentaria: " + this.cSupervision+ "\n";
    }

    public void setCodigoSupervision(int codigoDeSupervision){
        this.cSupervision = codigoDeSupervision;
    }

    public int getCodigoSupervision(){
        return cSupervision;
    }

}
