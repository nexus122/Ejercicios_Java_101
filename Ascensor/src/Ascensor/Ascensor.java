package Ascensor;

public class Ascensor {
    int min;
    int max;
    int piso;

    public Ascensor(int first, int last){
        this.min = first;
        this.max = last;
        this.piso = first;
    }

    public int getMax() {return this.max;}
    public int getMin() {return this.min;}
    public int getPiso() {return this.piso;}

    public void subir() {
        if((piso+1) < max)
            piso = piso + 1;
    }

    public void bajar() {
        if((piso-1) > min)
            piso = piso - 1;
    }

    public void ir(int planta) {
        if(planta <= min && planta >= this.max)
            piso = planta;
    }
}
