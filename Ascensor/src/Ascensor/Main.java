package Ascensor;

public class Main {
    public static void main(String[] args){
        p1();
        p2();
    }
    public static void p1(){
        Ascensor a2;
        Ascensor a1 = new Ascensor(0, 10);
        a2 = a1;
        a1.ir(6);
        a2.bajar();
        a1 = new Ascensor(-1, a1.getMax()/2);

        a1.ir(a2.getPiso());
        a1.subir();
        a2.bajar();
        System.out.println("El ascensor 1 esta en el piso: "+ a1.getPiso());
        System.out.println("El ascensor 2 esta en el piso: "+ a2.getPiso());
    }
    public static void p2(){
        Ascensor a1,a2,a3;
        a1 = new Ascensor(10,20);
        a3 = a1;
        a2 = new Ascensor(a3.getPiso()/2, a1.getMin());
        a3.subir();
        a2.ir(a1.getPiso());
        a3 = a2;
        a2 = new Ascensor(a3.getMin()-1, a2.getMax());

        System.out.println(a1.getPiso()+" "+a2.getPiso()+" "+ a3.getPiso());
        System.out.println(a1.getPiso()+a2.getPiso()+a3.getPiso());
    }
}
