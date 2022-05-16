package sentences;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 👨‍💻 Ejercicios de Java - Programación Estructurada -> Sentences
        boolean end = false;
        int first = 1;
        int last = 51;

        System.out.println("# INSTRUCCIONES");
        System.out.println("1. Los ejercicios son del p"+first+" al p"+last);
        System.out.println("2. Si quieres salir escribe -> exit");
        System.out.println("-----------------------------------");

        while (!end){
            Scanner read = new Scanner(System.in); // Esto nos sirve para poder pedir datos al usuario.
            System.out.print("Que ejercicio quieres ejecutar: ");
            String ejercicio = read.nextLine();

            switch (ejercicio.toLowerCase()) {
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
                case "p4b":
                    p4b();
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
                case "p15":
                    p15();
                    break;
                case "p16":
                    p16();
                    break;
                case "p17":
                    p17();
                    break;
                case "p18":
                    p18();
                    break;
                case "p19":
                    p19();
                    break;
                case "p20":
                    p20();
                    break;
                case "p21":
                    p21();
                    break;
                case "p22":
                    p22();
                    break;
                case "p23":
                    p23();
                    break;
                case "p24":
                    p24();
                    break;
                case "p25":
                    p25();
                    break;
                case "p26":
                    p26();
                    break;
                case "p27":
                    p27();
                    break;
                case "p28":
                    p28();
                    break;
                case "p29":
                    p29();
                    break;
                case "p30":
                    p30();
                    break;
                case "p31":
                    p31();
                    break;
                case "p32":
                    p32();
                    break;
                case "p33":
                    p33();
                    break;
                case "p34":
                    p34();
                    break;
                case "p35":
                    p35();
                    break;
                case "p36":
                    p36();
                    break;
                case "p37":
                    p37();
                    break;
                case "p38":
                    p38();
                    break;
                case "p39":
                    p39();
                    break;
                case "p40":
                    p40();
                    break;
                case "p41":
                    p41();
                    break;
                case "p42":
                    p42();
                    break;
                case "p43":
                    p43();
                    break;
                case "p44":
                    p44();
                    break;
                case "p45":
                    p45();
                    break;
                case "p46":
                    p46();
                    break;
                case "p47":
                    p47();
                    break;
                case "p48":
                    p48();
                    break;
                case "p49":
                    p49();
                    break;
                case "p50":
                    p50();
                    break;
                case "p51":
                    p51();
                    break;
                case "exit":
                    end = true;
                    break;
                default:
                    System.out.println("Este ejercicio no existe, prueba a poner alguno entre p"+first+" y p"+last+".");
                    System.out.println("Si lo que quieres es salir, escribe exit.");
                    break;

            }
        }

    }
    // Funciones de los ejercicios.
    public static void p1(){
        System.out.print("--- Ejercicio 1 ---");
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int x = reader.nextInt();
        if(x > 10){
            System.out.println("Numero demasiado alto");
        }else{
            System.out.println("Numero demasiado bajo");
        }
    }
    public static void p2(){
        System.out.print("--- Ejercicio 2 ---");
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana: ");
        String dia = reader.next().toLowerCase();
        if(dia.equals("lunes") ||dia.equals("martes")||dia.equals("miercoles")||dia.equals("jueves")||dia.equals("viernes"))
            System.out.println("Ha estudiar toca");
        else if(dia.equals("sabado") || dia.equals("domingo"))
            System.out.println("Por fin descanso!!!");
    }
    public static void p3(){
        System.out.println("--- Ejercicio 3 ---");
        Scanner reader = new Scanner(System.in);
        System.out.println("Cuanto dinero tienes?");
        int money = reader.nextInt();

        if(money < 5){
            System.out.println("Vamos al parque");
        } else if (money < 10){
            System.out.println("Vamos al videoclub");
        }else {
            System.out.println("Vamos al cine");
        }
    }
    public static int p4(){
        System.out.println("--- Ejercicio 4 ---");
        Scanner reader = new Scanner(System.in);
        int i=0, numero, suma = 0;

        // Bucle do para pedir 5 veces el numero.
        while(suma <100 && i < 5);{
            System.out.println("Introduce una cantidad: ");
            numero = reader.nextInt();
            suma = suma + numero;
            i++;
        }

        if(suma > 100){
            System.out.println("Te has pasado, "+ suma +" es mas grande que 100");
        }else{
            System.out.println("Resultado de la suma: "+ suma);
        }

        // Resolución del ejercicio
        if(i == 5) System.out.println("Secuencia correcta");
        else System.out.println("Secuencia incorrecta");

        // Enviamos un valor al siguiente ejercicio.
        return suma;
    }
    public static void p4b(){
        Scanner reader = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Introduce 1 numero, quedan "+ (5-i)+" por introducir: ");
            suma += reader.nextInt();
        }

        if(suma > 100) System.out.println("La Suma es : "+suma+"y es mayor que 100!");
        else System.out.println("La suma es: "+suma);
    }
    public static void p5(){
        System.out.println("--- Ejercicio 5 ---");
        int result = p4();
        if(result%2==0) System.out.println(result+" es multiplo de 2");
        if(result%3==0) System.out.println(result+" es multiplo de 3");
        if(result%5==0) System.out.println(result+" es multiplo de 5");

    }
    public static void p6(){

    }
    public static void p7(){

        System.out.println("--- Ejercicio 7 ---");

    }
    public static void p8(){
        System.out.println("--- Ejercicio 8 ---");
    }
    public static void p9(){
        System.out.println("--- Ejercicio 9 ---");
        int num = 37;
        for(int i = 1; i <= 10; i++){
            System.out.println(i+" x "+num+" = "+i*num);
        }
    }
    public static void p10(){
        System.out.println("--- Ejercicio 10 ---");
    }
    public static void p11(){

        System.out.println("--- Ejercicio 11 ---");
    }
    public static void p12(){

        System.out.println("--- Ejercicio 12 ---");
    }
    public static void p13(){

        System.out.println("--- Ejercicio 13 ---");
    }
    public static void p14(){

        System.out.println("--- Ejercicio 14 ---");
    }
    public static void p15(){

        System.out.println("--- Ejercicio 15 ---");
    }
    public static void p16(){
        System.out.println("--- Ejercicio 16 ---");
    }
    public static void p17(){
        System.out.println("--- Ejercicio 17 ---");
    }
    public static void p18(){
        System.out.println("--- Ejercicio 18 ---");
    }
    public static void p19(){
        System.out.println("--- Ejercicio 19 ---");
    }
    public static void p20(){
        System.out.println("--- Ejercicio 20 ---");
    }
    public static void p21(){
        System.out.println("--- Ejercicio 21 ---");
    }
    public static void p22(){
        System.out.println("--- Ejercicio 22 ---");
    }
    public static void p23(){
        System.out.println("--- Ejercicio 23 ---");
    }
    public static void p24(){
        System.out.println("--- Ejercicio 24 ---");
    }
    public static void p25(){
        System.out.println("--- Ejercicio 25 ---");
    }
    public static void p26(){
        System.out.println("--- Ejercicio 26 ---");
    }
    public static void p27(){
        System.out.println("--- Ejercicio 27 ---");
        Scanner reader = new Scanner(System.in);
        int cont = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Escribe un numero");
            double a = reader.nextInt();
            if(a > 0) cont++;
        }
    }
    public static void p28(){
        System.out.println("--- Ejercicio 28 ---");
    }
    public static void p29(){
        System.out.println("--- Ejercicio 29 ---");
    }
    public static void p30(){
        System.out.println("--- Ejercicio 30 ---");
    }
    public static void p31(){
        System.out.println("--- Ejercicio 31 ---");
        Scanner reader = new Scanner(System.in);
        long numero1, numero2, resultado=0;
        String operador;
        System.out.print("Introduce el primer número: ");
        numero1 = reader.nextLong();
        System.out.print("Introduce el segundo número: ");
        numero2 = reader.nextLong();
        System.out.print("Introduce el operador ( +, -, *, %, / ): ");
        operador = reader.next();

        if(operador.equals("+")) resultado = numero1+numero2;
        if(operador.equals("-")) resultado = numero1-numero2;
        if(operador.equals("*")) resultado = numero1*numero2;
        if(operador.equals("%")) resultado = numero1%numero2;
        if(operador.equals("/")) resultado = numero1/numero2;

        if(resultado == 0) System.out.println("No se puede realizar la operaión.");
        else System.out.println(numero1 +" "+operador+" "+numero2+" = "+ resultado);

    }
    public static void p32(){
        System.out.println("--- Ejercicio 32 ---");
        Scanner reader = new Scanner(System.in);
        boolean fin = false;
        int numDado, intentos=0, numAleatorio = (int)((Math.random()*100)+1);
        System.out.println("\u001B[35m"+"~~~¡ADIVINA!~~~"+"\u001B[0m");
        while (!fin){
            System.out.print("Dime un número del 1 al 100: ");
            numDado = reader.nextInt();
            intentos++;
            if(numDado > numAleatorio) System.out.println("El numero es mas pequeño");
            else if (numDado < numAleatorio) System.out.println("El numero es mas grande");
            else{
                System.out.println("¡Enhorabuena!, has acertado el número");
                System.out.println("Nº de intentos: "+intentos);
                System.out.println("¿Deseas continuar ? -> Escribe 'yes'");
                String cont = reader.next();
                if(cont.equals("yes")) fin = true;
                else{
                    numAleatorio = (int) ((Math.random()*100)+1);
                    intentos = 0;
                }
            }
        }
    }
    public static void p33(){
        System.out.println("--- Ejercicio 33 ---");
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int a = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int b = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int c = reader.nextInt();

        if((a==b) || (a==c) || (b==c)) System.out.println("Hay repericiones");
        else System.out.println("No hay repeticiones");

    }
    public static void p34(){
        System.out.println("--- Ejercicio 34 ---");
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int a = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int b = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int c = reader.nextInt();

        int suma = 0;
        if(a%5 == 0) suma+=a;
        if(b%5 == 0) suma+=a;
        if(c%5 == 0) suma+=a;

        System.out.print("La suma es: "+ suma);

    }
    public static void p35(){
        System.out.println("--- Ejercicio 35 ---");
        System.out.println("--- Ejercicio 34 ---");
        Scanner reader = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int a = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int b = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int c = reader.nextInt();

        int suma = 0;
        if(a%5 == 0) suma+=a;
        if(b%5 == 0) suma+=a;
        if(c%5 == 0) suma+=a;

        if(suma == 0) System.out.println("No hay ningun multiple de 5");
        else System.out.println("Hay algun multiple de 5: "+ suma);
    }
    public static void p36(){
        System.out.println("--- Ejercicio 36 ---");
        Scanner reader = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int a = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int b = reader.nextInt();
        System.out.print("Escribe otro numero: ");
        int c = reader.nextInt();

        if(a > 0){
            if(b%7==0) System.out.println(b+" es multipo de 7");
            if(c%7==0) System.out.println(c+" es multipo de 7");
        }else if(a<0){
            if(b > c) System.out.println(b+" "+c);
            else System.out.println(c+" "+b);
        }else System.out.println("La suma de los absolutos es: "+(b+c));

    }
    public static void p37(){
        System.out.println("--- Ejercicio 37 ---");
        Scanner reader = new Scanner(System.in);
        int sumaPares = 0, sumaImpares = 0;
        for(int i = 0; i < 4; i++){
            int num = reader.nextInt();
            if(num%2==0) sumaPares+=num;
            else sumaImpares+=num;
        }

        if(sumaPares>=(4*sumaImpares)) System.out.println("La suma de los pares supera oe es igual a 4 veces la suma de los impares.");
        else System.out.println("La suma de los pares no supera ni es igual a 4 veces la suma de los impares.");

    }
    public static void p38(){
        System.out.println("--- Ejercicio 38 ---");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        for(int i = 0; i < a; i++){
            System.out.print(i+" ");
            i++;
        }
    }
    public static void p39(){
        System.out.println("--- Ejercicio 39 ---");
        

    }
    public static void p40(){
        System.out.println("--- Ejercicio 40 ---");
    }
    public static void p41(){
        System.out.println("--- Ejercicio 41 ---");
    }
    public static void p42(){
        System.out.println("--- Ejercicio 42 ---");
    }
    public static void p43(){
        System.out.println("--- Ejercicio 43 ---");
    }
    public static void p44(){
        System.out.println("--- Ejercicio 44 ---");
    }
    public static void p45(){
        System.out.println("--- Ejercicio 45 ---");
    }
    public static void p46(){
        System.out.println("--- Ejercicio 46 ---");
    }
    public static void p47(){
        System.out.println("--- Ejercicio 47 ---");
    }
    public static void p48(){
        System.out.println("--- Ejercicio 48 ---");
    }
    public static void p49(){
        System.out.println("--- Ejercicio 49 ---");
    }
    public static void p50(){
        System.out.println("--- Ejercicio 50 ---");
    }
    public static void p51(){

        System.out.println("--- Ejercicio 51 ---");
    }
}
