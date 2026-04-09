package EjercicioHerencia1;

public class Main {
    
    public static void main(String[] args) {
        

        Boleto boleto = new Boleto("rio gallegos", "buenos aires", "perassi martin", 43892935, "24/4", 250000.45);

        System.out.println(boleto.toString());
        System.out.println();

        PrimeraClase boleto1 = new PrimeraClase("rio gallegos", "miami", "cristina reinecke", 42568900, "31/2", 234000.23);
        System.out.println(boleto1.toString());
        boleto1.cambiarDestino("rio de janeiro");
        boleto1.cambiarFecha("25/5");
        System.out.println();

        Turista boleto2 = new Turista("Cordoba", "catamarca", "veronica sosa", 23456233, "11/10", 450030);
        System.out.println(boleto2.toString());
        boleto2.cambiarDestino("rio gallegos");
        boleto2.cambiarFecha("31/12");
        System.out.println();

        Economico boleto3 = new Economico("tucuman", "san juan", "lizy tagliani", 12890034, "03/12", 234100);
        System.out.println(boleto3.toString());
        boleto3.cambiarDestino("salta");
        boleto3.cambiarFecha("24/4");

    }
}
