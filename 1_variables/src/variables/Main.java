package variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 👨‍💻 Ejercicios de Java - Programación Estructurada -> Variables
        Boolean end = false;
        System.out.println("# INSTRUCCIONES");
        System.out.println("1. Los ejercicios son del p1 al p14");
        System.out.println("2. Si quieres salir escribe -> exit");
        System.out.println("-----------------------------------");
        while (!end){
            Scanner read = new Scanner(System.in); // Esto nos sirve para poder pedir datos al usuario.
            System.out.print("Que ejercicio quieres ejecutar: ");
            String ejercicio = read.nextLine();

            switch (ejercicio) {
                case "p1":
                    p1();
                    break;
                case "p2":
                    p2();
                    break;
                case "p3":
                    p3();
                    break;
                case "p4":
                    p4();
                    break;
                case "p5":
                    p5();
                    break;
                case "p6":
                    p6();
                    break;
                case "p7":
                    p7();
                    break;
                case "p8":
                    p8();
                    break;
                case "p9":
                    p9();
                    break;
                case "p10":
                    p10();
                    break;
                case "p11":
                    p11();
                    break;
                case "p12":
                    p12();
                    break;
                case "p13":
                    p13();
                    break;
                case "p14":
                    p14();
                    break;
                case "exit":
                    end = true;
                    break;
                default: {
                    System.out.println("Este ejercicio no existe, prueba a poner alguno entre p1 y p14.");
                    System.out.println("Si lo que quieres es salir, escribe exit.");
                }
            }
        }

    }

    public static void p1(){
        System.out.println("--- Ejercicio 1 ---");
        Boolean x = true;
        Boolean y = false;
        // El "esto || esto otro" hace que si una de las dos condiciones es correcta de true
        System.out.print("x || y: ");
        System.out.println(x || y); // Devuelve true

        // El "esto && esto otro" hace que si las dos condiciones no son correctas es false
        System.out.print("x && y: ");
        System.out.println(x && y); // Devuelve false
    }
    public static void p2(){
        System.out.println("--- Ejercicio 2 ---");
        int x = 25;
        System.out.println(x==7); // Esto nos devuelve false, porque x es 25 y 25 no es igual a 7
    }
    public static void p3(){
        System.out.println("--- Ejercicio 3 ---");
        int x = 25;
        int y = 77;
        System.out.println(x!=y); // Devuelve true pues x es diferente a y
    }
    public static void p4(){
        System.out.println("--- Ejercicio 4 ---");
        int a = 4, b=6, c=7, d=8,e=9,f=8; // Podemos definir muchas variables de un tipo en una linea.
        int resp = (a+b-c*(d/e))*f; // La respuesta es 80.
        System.out.println("Respuesta: "+resp);
    }
    public static void p5(){
        System.out.println("--- Ejercicio 5 ---");
        float x = 23.5f;
        //int y = x;
        // Obtenemos un error, puesto que double es un float y utiliza comilla para decimales, mientras que integer no.
        System.out.println("Este ejercicio devuelve un error, pues intentamos meter una variable de tipo double/float en un integer.");
    }
    public static void p6(){
        System.out.println("--- Ejercicio 6 ---");
        float x = 23.5f;
        int y = (int)x;
        System.out.println("y: "+y);
        System.out.println("La operación es correcta, puesto a que utilizamos una conversion de float a entero 'int y = (int)x;'");
    }
    public static void p7(){
        System.out.println("--- Ejercicio 7 ---");
        int x = 23;
        float y = x;
        System.out.println("Parece que no hay problema, porque permite convertir los enteros a float pero no al reves.");
    }
    public static void p8(){
        System.out.println("--- Ejercicio 8 ---");
        int x = 23;
        float y = (float)x;
        System.out.println("Parece que no hay problema, porque permite convertir los enteros a float tanto implicita como explicitamente.");
    }
    public static void p9(){
        System.out.println("--- Ejercicio 9 ---");
        System.out.println("Que tipo de dato usarías para una máxima precisión con decimales");
        System.out.println("Entre [int , Double , Float, Short] hay que utilizar el tipo double.");
    }
    public static void p10(){
        System.out.println("--- Ejercicio 10 ---");
        // Ejecutamos las funciones que llaman a la parte del codigo asociadas, y asi ver lo que sacan.
        p10a();p10b();p10c();p10d();p10e();p10f();p10g();p10h();p10i();p10j();p10k();
    }
    public static void p10a(){
        int a;
        int b;
        a = 10;
        b = 15;
        a = b+3+5*b;
        b = a-b*2;
        a = a+b;

        System.out.println("- Ejercicio p10a");
        System.out.println(a);
        System.out.println(b);
    }
    public static void p10b(){
        int a;
        int b;
        a = 10;
        b = 11;
        a = b/4%3;
        b = 2+a*3/2+1;
        System.out.println("- Ejercicio p10b");
        System.out.println(a);
        System.out.println(b);
    }
    public static void p10c(){
        int a, b, c;
        a = 10;
        b = 11;
        a = 2+b-1*2/4;
        b = a+2*b+1;
        c = a%b + b%a + a/b +b/a;
        System.out.println("- Ejercicio p10c");
        System.out.println(c);
    }
    public static void p10d(){
        double a, b;
        a = 30.0;
        b = 10.5;
        a = a + 10-0/3 + (b-1/2.0);
        b = -b;
        System.out.println("- Ejercicio p10d");
        System.out.println(a);
        System.out.println(b);
    }
    public static void p10e(){
        double a,b;
        a = 30.0;
        b = 10.5;

        a= a+10/3+(b-1/2);
        b = -b;

        System.out.println("- Ejercicio p10e: ");
        System.out.println(a);
        System.out.println(b);
    }
    public static void p10f(){
        int e,f;
        e = -1 + 2*3/4%5;
        f = -(1+(2*(3/(4%5))));
        System.out.println("- Ejercicio p10f");
        System.out.println(e);
        System.out.println(f);
    }
    public static void p10g(){
        boolean m,n;
        m = true && false || true && !false;
        n = m && true && (false ||true) && !(true || false);
        m = !n || !m && !(m && !n);
        n = true || m && !(false && n);

        System.out.println("- Ejercicio p10g");
        System.out.print(m);
        System.out.print(n);
    }
    public static void p10h(){
        int e, f;
        e = -(12+4/3*5);
        f = -(12+4/(3*5));
        e = e + 10*4 - 3/2;
        f = (e + 10)*(4-3)/2;
        System.out.println("- Ejercicio p10h");
        System.out.println(e);
        System.out.println(f);
    }
    public static void p10i(){
        boolean m,n; int a,b;
        a = 12 + 7/3;
        b = 13 -7%3;
        m = a-b < b-a;
        n = a+2 > b-2;
        m = a+b != 25+4%3;
        n = (a<4 || b<19) & !m;
        System.out.println("- Ejercicio p10g");
        System.out.println(m);
        System.out.println(n);
    }
    public static void p10j(){
        char c = 'a';
        int a = 12;
        boolean res;
        res = c!='c' && 'b'>=c;
        res = res == !true||a%5 >= a%4;
        System.out.println("- Ejercicio p10j");
        System.out.println(res);
    }
    public static void p10k(){
        char cart, car2, car3;
        boolean bu;
        cart='b';
        car2 = '3';
        car3 = 'F';
        bu = (cart > car2) && (car3 != cart);
        bu = bu && !(car3 <= car2);
        System.out.println(bu);
    }
    public static void p11(){
        System.out.println("--- Ejercicio 11 ---");
        System.out.println("- Ejercicio p11a: Estamos intentando pasar un int a dobule de forma implicita.");
        System.out.println("- Ejercicio p11b: No podemos sumarle uno a un Char, ya que es un caracter unicode");
        System.out.println("- Ejercicio p11c: No se puede comprobar si i es mayor que 20 porque pese a declararla no le hemos dado ningun valor");
        System.out.println("- Ejercicio p11d: El codigo es camel case, por lo tanto una variable que se declara en minusculas, si la llamas capitalizada es una variable distinta, como no se han declarado las variables que se estan utilizando no funcionan.");
        System.out.println("- Ejercicio p11e: Cuando intentamos leer el dato estamos asignando un dato Double a un integer en la variable num3 y por eso peta.");
    }
    public static void p12(){
        System.out.println("--- Ejercicio 12 ---");
        int i1, i2;
        double d1, d2;
        char c1,c2;
        boolean b1,b2;
        // Integers
        i1 = 1 -2 + 23 /4%3*3;
        i2 = 2*7 %5 / 8+1*3;

        // Double
        d1 = 3.0 + 2.5 +5.0 /2.0;
        d2 = i1/2 +12/2.0 +1;
        // Char
        c1 = 'A';
        c2 = 'Z';
        // Boolean
        b1 = c1 == c2 || c1 > 'T' && c2 <= 'K';
        b2 = false || true && false != false && true;

        System.out.println("i1: "+i1+" i2: "+i2);
        System.out.println("d1: "+d1+" d2: "+d2);
        System.out.println("c1: "+c1+" c2: "+c2);
        System.out.println("b1: "+b1+" b2: "+b2);

    }
    public static void p13(){
        System.out.println("--- Ejercicio 13 ---");
        int prEnt, sgEnt;
        double prDoub, sgDoub;
        boolean prBool, sgBool;
        char ch;

        prEnt = 17;
        sgEnt = prEnt % 9 / 3;
        prEnt = sgEnt + sgEnt * prEnt / 3;

        prDoub = 24 / 6 * 2 +1;
        sgDoub = (prDoub -1.0)/16;

        ch = 'A';
        prBool = ch !='A' == ch < 'Z';
        sgBool = (prBool && true) || (prBool==true)||!prBool;
        System.out.println("prEnt: "+prEnt+ " sgEnt: "+sgEnt);
        System.out.println("prDoubl: "+ prDoub+" sgDoubl: "+sgDoub);
        System.out.println("prBool: "+ prBool+" sgBool: "+sgBool);
    }
    public static void p14(){
        System.out.println("--- Ejercicio 14 ---");
        int i,j;
        char c;
        double d;
        boolean b1,b2;
        i = 10 +3 /2;
        j = i%2*4;
        c='a';
        d = 10.0/j-1;
        b1 = c<'c' && i<j != true;
        b2 = !b1 || false || !true || b1==false;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("d="+d);
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
    }
}
