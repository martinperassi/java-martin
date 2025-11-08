package Clases_y_Objetos;

import java.util.Scanner;

public class Personaje {
    //Atributos
    private String nombre;
    private String clase;
    private int vida;

    //Constructor
    Personaje(String nombre, String clase, int vida){
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
    }

    //Metodos
    public String getNombre(){
        return "nombre: " + nombre;
    }

    public String setNombre(String nuevo_nombre){
        this.nombre = nuevo_nombre;
        return "nuevo nombre: " + nuevo_nombre;
    }

    //sobreescribimos el metodo toString para que muestre todos los atributos del personaje
    @Override
    public String toString(){
        return "nombre: " + nombre + "\nclase: " + clase + "\nvida: " + vida;
    }

    //Creamos un metodo que muestre un menu interactivo:
    Scanner scanner = new Scanner(System.in);
    private int eleccion;

    public void menuBienvenida(){
        boolean bandera = true;
            while(bandera == true){
                System.out.println("BIENVENIDO!!!, ¿Qué quieres hacer?\n 1.Cambiar nombre.\n 2.Salir");
                System.out.print("Eleccion:");
                eleccion = scanner.nextInt();
                scanner.nextLine();
                switch(eleccion){
                    case 1:
                        System.out.println("elige un nuevo nombre");
                            String nombre = scanner.nextLine();
                            this.nombre = nombre;
                            break;
                    case 2:
                        System.out.println("saliendo del menu...");
                        bandera = false;
                        break;
                    default:
                        System.out.println("vuelve a intentar, reacuerda que tienes que ingresar 1 o 2...");
                }


            }
    }


}
