package Clases_y_Objetos;

public class Perro {
    
    //ATRIBUTOS
    private String raza;
    private String sexo;
    private String color;
    private int edad;

    //CONSTRUCTOR
    Perro(String raza, String sexo,String color ,int edad){
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    //METODOS

    public String getRaza(){
        return "raza: " + raza;
    }
    public String setRaza(String nueva_raza){
        this.raza = raza;
        return "nueva raza: " + raza;
    }

    public String ladrar(){
        return "el perro " + getRaza() + " esta ladrando...";
    }


}
