package dentista;

public class Ortodoncia extends LineaTratamiento{
    public int numDientesAfectados;

    public Ortodoncia(String concepto){ super(concepto); }
    public Ortodoncia(){ super();}

    public float calculaImporte(){
        return 1000;
    }
}
