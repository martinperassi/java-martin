package Diagnostico2026;

public class Gestor {
    Banda[] gestorBandas;
    int size, next;

    public Gestor(int n){
        size = n;
        next = 0;
        gestorBandas = new Banda[size];
    }

    //METODOS
    public void agregarBanda(Banda banda){
        //verificacion en caso de que se llegue al maximo de almacenamiento
        if(!(this.next < this.size)){
            this.enlarge();
        }
        gestorBandas[next] = banda;
        next++;
    }

    private void enlarge(){
        int count2 = 0;
        Banda [] aux = new Banda[size + 100];//PASO 1.
        for(int count1 = 0; count1 < size; count1++){//PASO 2.
            if(gestorBandas[count1] != null){
                aux[count2] = gestorBandas[count1];
                count2++;
            }
            this.gestorBandas = aux;//PASO 3.
            this.next = count2;
            this.size = size + 100;
        }

    }

    public void mostrarBandas(){
        Banda aux;
        int count = 0;

        while(count < next){
            if(gestorBandas[count] != null){
                aux = gestorBandas[count];
                System.out.println(aux.getNombre());
            }
            count++;
        }
    }

    public void mostrarFechas(){
        Banda aux;
        int count = 0;
        while(count < next){
            if(gestorBandas[count] != null){
                aux = gestorBandas[count];
                System.out.println(aux.getNombre());
                System.out.println("Fecha: " + aux.getDia());
                System.out.println();
            }
            count++;
        }
    }

    public void mostrarEscenarios(){
        Banda aux;
        int count = 0;
        while(count < next){
            if(gestorBandas[count] != null){
                aux = gestorBandas[count];
                System.out.println(aux.getNombre());
                System.out.println(aux.getEscenario());
                System.out.println();
            }
            count++;
        }
    }

    public void mostrarHorarios(){
        Banda aux;
        int count = 0;

        while(count < next){
            if(gestorBandas[count] != null){
                aux = gestorBandas[count];
                System.out.println(aux.getNombre());
                System.out.print("HORA DE ARRANQUE: " + aux.getHoraArranque() + " - DURACION DEL SHOW: " + aux.getDuracionParticipacion() + ".");
                System.out.println();
            }
            count++;
        }
    }


}
