package dentista;

public class Higiene extends LineaTratamiento{
    public Higiene(String concepto){ super(concepto);}
    public Higiene(){super();}

    public float calcularImporte(){ return 60;}
}
