package EjercicioHerenciaYPolimorfismo;

public class Producto {
    
    private String nombre;
    private String fEnvasado;
    private String fCaducidad;
    private int nLote;
    private String pOrigen;

    //CONSTRUCTOR
    Producto(String nombre,String fEnvasado, String fCaducidad, int nLote, String pOrigen){
        this.nombre = nombre;
        this.fEnvasado = fEnvasado;
        this.fCaducidad = fCaducidad;
        this.nLote = nLote;
        this.pOrigen = pOrigen;
    }

    //GET
    public String getNombre(){
        return nombre;
    }

    public String getFCaducidad(){
        return fCaducidad;
    }

    public int getNLote(){
        return nLote;
    }

    public String getPOrigen(){
        return pOrigen;
    }

    public String getFEnvasado(){
        return fEnvasado;
    }

    //SET
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setFEnvasado(String nuevaFechaEnvasado){
        this.fEnvasado = nuevaFechaEnvasado;
    }    

    public void setFCaducidad(String nuevaFechaCaducidad){
        this.fCaducidad = nuevaFechaCaducidad;
    }

    public void setNLote(int nuevoNumeroLote){
        this.nLote = nuevoNumeroLote;
    }

    public void setPOrigen(String nuevoPaisOrigen){
        this.pOrigen = nuevoPaisOrigen;
    }

    public String mostrarDatos(){
        return "Informacion del producto" + "\nNombre: " + this.nombre + "\nFecha de Envasado: " + this.fEnvasado + "\nFecha de Caducidad: " + this.fCaducidad + "\nNumero de Lote: " + this.nLote + "\nPais de Origen: " + this.pOrigen + "\n";
    }


}
