package Diagnostico2026;
import java.util.Scanner;

public class MainLollapalooza {    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Gestor bandas = new Gestor(10);
    Banda banda1 = new Banda("CIRO Y LOS PERSA", "24/4", "1 HORA", "ESCENARIO 1", "16hs");
    bandas.agregarBanda(banda1);
    Banda banda2 = new Banda("TAN BIONICA", "24/4", "2 HORAS", "ESCENARIO 1", "17hs");
    bandas.agregarBanda(banda2);
    Banda banda3 = new Banda("KE PERSONAJES", "25/4", "1:30 HORAS", "ESCENARIO 2", "20hs");
    bandas.agregarBanda(banda3);
    Banda banda4 = new Banda("CALLEJEROS", "25/4", "1 HORA", "ESCENARIO 3", "19hs");
    bandas.agregarBanda(banda4);
    Banda banda5 = new Banda("LAS PASTILLAS DEL ABUELO", "26/4", "1:20 HORAS", "ESCENARIO 2", "21:30hs");
    bandas.agregarBanda(banda5);

    int op = 5;

    do{
        System.out.println("********************************************************");
        System.out.println("BIENVENIDO AL MENU DEL LOLLAPALOOZA, ELIGE UNA OPCION!: ");
        System.out.println();
        System.out.println("1.CONSULTAR BANDAS:");
        System.out.println();
        System.out.println("2.CONSULTAR DIAS QUE TOCAN LAS BANDAS:");
        System.out.println();
        System.out.println("3.CONSULTAR ESCENARIOS DONDE TOCAN LAS BANDAS:");
        System.out.println();
        System.out.println("4.CONSULTAR HORARIOS"); 
        System.out.println();
        System.out.println("5. SALIR");
        System.out.println("********************************************************");
        System.out.print("Eleccion: ");
        op = scanner.nextInt();
        scanner.nextLine();

        switch(op){

            case 1:{
                System.out.println("BANDAS DEL EVENTO");
                bandas.mostrarBandas();
                break;

            }
            case 2:{
                System.out.println("FECHAS");
                bandas.mostrarFechas();
                break;
            }
            case 3:{
                System.out.println("ESCENARIOS DONDE TOCAN LAS BANDAS");
                bandas.mostrarEscenarios();
                break;
            }
            case 4:{
                System.out.println("HORARIOS");
                bandas.mostrarHorarios();
                break;
            }
            case 5:{
                System.out.println("ADIOS! :D");
                break;
            }
            default:
                System.out.println("SELECCIONA UNA OPCION DEL 1 AL 5");
                break;
        }
    }
    while(op!= 5);
    scanner.close();
    }
}
