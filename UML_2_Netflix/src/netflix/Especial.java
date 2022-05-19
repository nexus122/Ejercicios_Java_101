package netflix;

public class Especial extends Capitulo{
    public Especial() {
        super();
    }

    public Especial (int duration, int num, Temporada temporada) {
        super(num,temporada, duration);
    }

    @Override
    public void iniciar() {
        super.iniciar();
        System.out.println("Hola soy el Especial");
    }
}
