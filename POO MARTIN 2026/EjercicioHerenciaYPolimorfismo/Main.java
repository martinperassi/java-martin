package EjercicioHerenciaYPolimorfismo;

public class Main {
    
    public static void main(String[] args) {

        Stock myStock = new Stock(10);


        Frescos p1 = new Frescos("naranja", "23/9/2024", "30/3/2025", 12345, "brasil", 0.23);
        myStock.agregarProducto(p1);

        Refrigerados p2 = new Refrigerados("manzana", "14/1/2024", "23/23/2026", 52234, "brasil", 1010 );
        myStock.agregarProducto(p2);

        Congelados p3 = new Congelados("frutos del bosque", "12/6/2022", "31/5/2023", 50234, "chile", 13.2);
        myStock.agregarProducto(p3);

        Frescos p4 = new Frescos("lechuga", "23/4/2021", "23/4/2022", 40892, "argentina", 0.250);
        myStock.agregarProducto(p4);

        Refrigerados p5 = new Refrigerados("Pack x6 Quilmes", "25/12/2025", "25/12/2026", 49012, "argentina", 6666);
        myStock.agregarProducto(p5);
        

        myStock.mostrarProductosDeUnPais("brasil");

        myStock.mostrarCantidadFrescos();

        myStock.mostrarRefrigeradosPorRangoDeLote(10000, 60000);
       




        


    }


}
