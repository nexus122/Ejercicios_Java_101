package dentista;

public class Caries extends LineaTratamiento{
    public int numDientesAfectados;
    public Caries(String concepto) {
        super(concepto);
    }
    public Caries() { super(); }

    public Caries(String concepto, int numDientes){
        super(concepto);
        this.numDientesAfectados = numDientes;
    }

    public float calculaImporte(){ return 50;}
}
