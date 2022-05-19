package Ejercicio_1;

public class Vehicle {
    {
        System.out.println("Bloque de inicializacion no estatico");
    }
    static {
        System.out.println("Bloque estatico de inicialización -> Solo se ejecuta la primera vez");
    }
    public Vehicle(){
        System.out.println("Un nuevo coche ha sido creado!");
    }

    public void iniciar(){
        System.out.println("Rum Rum !");
    }
    public static void parar(){
        System.out.println("Parar");
    }
    public void accelerar(){
        System.out.println("Acelerar");
    }

    // Ejercicio 4
    static final int estfinal = 0;
    final int solofinal = 0;
    static int soloestatico = 0;

}
