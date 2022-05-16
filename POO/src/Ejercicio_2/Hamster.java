package Ejercicio_2;

public class Hamster extends Rossegador{
    public final static String tipo = "Hamser";
    public void ensumar(){
        System.out.println("El "+tipo+" Olfatea");
    }
    public void rossegar(){
        System.out.println("El "+tipo+" Roe");
    }
    public void correr(){
        System.out.println("El "+tipo+" Corre");
    }
}
