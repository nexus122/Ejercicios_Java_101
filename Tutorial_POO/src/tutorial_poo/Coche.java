package tutorial_poo;

public class Coche extends Vehiculo{
    private int numPuertas;
    private int capacidadMaletero;

    public Coche(String marca, String modelo, String color, int caballos) {
        super(marca, modelo, color, caballos);
        this.numPuertas = 5;
        this.capacidadMaletero = 200;
    }

    /* GETTERS & SETTERS */
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}
