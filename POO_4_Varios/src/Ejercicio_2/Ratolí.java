package Ejercicio_2;

public class Ratolí extends Rossegador{
    public final static String tipo = "Ratoli";
    public void ensumar(){
        System.out.println("El "+this.tipo+" Olfatea");
    }
    public void rossegar(){
        System.out.println("El "+this.tipo+" Roe");
    }
    public void correr(){
        System.out.println("El "+this.tipo+" Corre");
    }
}
