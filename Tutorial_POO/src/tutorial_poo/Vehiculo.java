package tutorial_poo;

public class Vehiculo {
    /* Una clase se basea en:
    Atributos, Propiedades -> Indican el estado del objeto.
    normalmente son privados.
    ---------------------------------------------------------------------------------
    Metodos, Funciones -> Normalmente son publicos.
     - a) Constructor
     - b) Getters - Setters
     - c) Resto ("Funciones etc...")
    */
    private String color;
    private int caballos;
    private  String marca;
    private String modelo;

    // Si no colocas ningun constructor se crea uno "vacio" por defecto
    public Vehiculo(String marca, String modelo, String color, int caballos){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.caballos = caballos;
    }

    /* GETTERS & SETTERS */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
