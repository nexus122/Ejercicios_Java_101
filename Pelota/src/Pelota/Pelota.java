package Pelota;

public class Pelota {
    private String name;
    private int presion;
    private boolean operativa;
    public Pelota(String name){
        this.name = name;
        this.presion = 0;
        this.operativa = false;
    }

    public void inflar(int i) {
        if(this.operativa) return;
        this.presion += i;
        if(presion >= 20) this.operativa = true;
    }

    public String botar() {
        // Devolvemos un string que dice Boing Boing.
        String say;
        if(this.operativa) say = "La pelota "+this.name+" no bota porque se ha reventado";
        else say = "La pelota "+this.name+" hace Boing Boing";
        return say;
    }

    public void desinflar(int i) {
        if(this.operativa) return;
        this.presion -= i;
        if(this.presion > 0) this.operativa = true;
    }
}
