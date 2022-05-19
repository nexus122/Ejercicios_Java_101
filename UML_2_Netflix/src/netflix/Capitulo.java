package netflix;

import java.util.ArrayList;

public class Capitulo {
    private final int DURACION = 45;
    int duration;
    int num;

    private Temporada temporada; // Las relaciones donde solo hay 1 solo guardan 1 objeto de la clase temporada.
    private ArrayList<Personaje> personajes; // Como pueden haber mas de un personaje en un capitulo se guardan como string.

    // Constructores de capitulo
    public void setNum(int num) {
        this.num = num;
    }

    public Capitulo( int num, Temporada temporada, int duration) {
        this.duration = duration;
        this.num = num;
        this.temporada = temporada;
        this.personajes = new ArrayList<Personaje>();
    }
    public Capitulo() {
        this.personajes = new ArrayList<Personaje>();
    }

    // Metodos
    // Esto recorre nuestra lista de personajes del capitulo
    public String listaPersonajes(){
        StringBuilder sb = new StringBuilder();
        for(Personaje personaje:personajes){
            sb.append(personaje);
        }
        return sb.toString();
    }

    public int getNum() {
        return num;
    }

    public void iniciar() {
        System.out.println("Hola soy el capitulo");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Capitulo other = (Capitulo) obj;
        if (DURACION != other.DURACION)
            return false;
        if (duration != other.duration)
            return false;
        if (num != other.num)
            return false;
        if (personajes == null) {
            if (other.personajes != null)
                return false;
        } else if (!personajes.equals(other.personajes))
            return false;
        if (temporada == null) {
            if (other.temporada != null)
                return false;
        } else if (!temporada.equals(other.temporada))
            return false;
        return true;
    }

    public int getDuracion() {
        return duration;
    }
}
