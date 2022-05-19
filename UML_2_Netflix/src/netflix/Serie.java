package netflix;

import java.util.ArrayList;

public class Serie {
    String titulo;
    private ArrayList<Temporada> temporadas;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){ this.titulo = titulo;}
    public Serie() {//Por defecto
        this.temporadas = new ArrayList<Temporada>();
    }
    public Serie(String titulo) {//Full
        this.titulo = titulo;
        this.temporadas = new ArrayList<Temporada>();
    }

    public boolean addTemporada(Temporada temporada){
        if(!temporadas.contains(temporada)){
            temporadas.add(temporada);
            return true;
        }else{
            return false;
        }
    }

    public int calculaDuracion() {
        int duracion = 0;
        for(Temporada temporada: temporadas) {
            //duracion+=temporada.getDuracion();
            ArrayList<Capitulo> capitulos = temporada.getCapitulos();
            for(Capitulo capitulo: capitulos) {
                duracion+=capitulo.getDuracion();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        String res= "Serie [titulo=" + titulo + " ]\n";
        for(Temporada temporada:temporadas)
            res=res+temporada;
        return res;
    }

}
