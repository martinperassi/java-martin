package Clases_y_Objetos;

public class Main{
    public static void main(String[] args) {
            Perro perro1 = new Perro("Labrador", "Macho", "Negro", 12);

            System.out.println(perro1.ladrar());
            System.out.println(perro1.getRaza());
            System.out.println(perro1.setRaza("pitbul"));
            System.out.println();

            Personaje p1 = new Personaje("Carlos", "espadachin", 1450);
            System.out.println(p1.toString());
            System.out.println(p1.setNombre("martin"));
            System.out.println(p1.getNombre());
            System.out.println();

            p1.menuBienvenida();
            System.out.println(p1.getNombre());


            

    }
}
