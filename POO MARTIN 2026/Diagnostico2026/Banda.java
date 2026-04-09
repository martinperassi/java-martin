package Diagnostico2026;

public class Banda {
    
    private String nombre, duracionParticipacion, dia, escenario, horaArranque;

    public Banda(String nombre, String dia, String duracionParticipacion, String escenario, String horaArranque){
        this.nombre = nombre;
        this.dia = dia;
        this.duracionParticipacion = duracionParticipacion;
        this.escenario = escenario;
        this.horaArranque = horaArranque;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDia(){
        return dia;
    }

    public String getDuracionParticipacion(){
        return duracionParticipacion;
    }

    public String getEscenario(){
        return escenario;
    }

    public String getHoraArranque(){
        return horaArranque;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public void setDuracionParticipacion(String duracion){
        this.duracionParticipacion = duracion;
    }

    public void setEscenario(String escenario){
        this.escenario = escenario;
    }

    public void setHoraArranque(String horaArranque){
        this.horaArranque = horaArranque;
    }


}
