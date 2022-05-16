package tutorial_poo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Nissan","Primer", "Rojo",150);
        v1.setColor("amarillo");
        v1.setCaballos(180);
        Vehiculo v2 = new Vehiculo("Dacia","Sandero", "Verde",150);

        Coche coche1 = new Coche("Dacia","Sandero", "Verde", 150);

        System.out.print("Coche 1: ", coche1);
    }
}
