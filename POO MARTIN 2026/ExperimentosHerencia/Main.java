package ExperimentosHerencia;

public class Main {

    public static void conduce(Vehiculo v){
        v.anda();
    }

    public static void main(String[] args) {

        Bicicleta b = new Bicicleta();
        Coche c = new Coche();
        Vehiculo v = new Vehiculo();

        //forma de hacerlo usando el metodo anda de la clase madre
        b.anda();
        v.anda();
        c.anda();
        System.out.println();
        //forma de hacerlo creando metodo conduce fuera del main
        conduce(v);
        conduce(b);
        conduce(c);

    }
}
