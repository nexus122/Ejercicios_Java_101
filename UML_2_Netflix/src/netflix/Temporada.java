package netflix;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private Serie serie;

    public ArrayList<Capitulo> capitulos;

    public Temporada(int numero) {
        this.numero = numero;
        this.capitulos = new ArrayList<Capitulo>();
    }
    public Temporada(int numero, Serie serie) {
        this.numero = numero;
        this.serie = serie;
        this.capitulos = new ArrayList<Capitulo>();
    }

    // Metodos
    public String listacapitulos(){
        StringBuilder sb = new StringBuilder();

        for (Capitulo capitulo:capitulos){
            sb.append(serie.getTitulo()+" T:"+numero+" C:"+capitulo.getNum());
        }

        return sb.toString();
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }
}
