package vectores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 👨‍💻 Ejercicios de Java - Programación Estructurada -> Sentences
        boolean end = false;
        int first = 1;
        int last = 26;

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
    static void p1(){
        System.out.println("--- Ejercicio 11 ---");
        String[] fruits = new String[] {"Pineapple", "Apple", "Orange","Banana"};

        // Bucle de array.
        System.out.print("--- For: ");
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i]+" \t");
        }
        System.out.println("");
        System.out.print("--- \"Foreach\": ");
        // Foreach
        for(String f:fruits){
            System.out.print(f+" \t");
        }

    }
    static void p2(){
        System.out.println("--- Ejercicio 2 ---");
        ArrayList<String> list = new ArrayList<String>();
        list.add("hola");
        list.add("buenos");
        list.add("buenos");
        list.add("dias");

        list.remove("buenos");

        System.out.println("El array es: "+ list);
    }

    public static void p3(){
        System.out.println("--- Ejercicio 3 ---");

    }
    public static void p4(){
        System.out.println("--- Ejercicio 4 ---");
        Scanner reader = new Scanner(System.in);
        int N = 10;
        int num1[] = new int[10];
        int num2[] = new int[10];
        int sum = 0;
        for (int i = 0; i < N; i++){
            System.out.print("Introduce el componente "+i+" vector 1: ");
            num1[i] = reader.nextInt();
        }
        for (int i=0; i<N; i++){
            System.out.print("Introduce componente "+i+" vector 2");
        }

        for(int i = 0; i < N; i++){
            sum += num1[i]*num2[i];
        }

        System.out.println("El producto escalar es: "+ sum);

    }
    public static void p5(){
        System.out.println("--- Ejercicio 5 ---");
        int nums1[] = {1,2,3};
        int nums2[] = {1,2,3};
        int sum = 0;
        for (int i = 0; i< nums1.length; i++)
            sum += nums1[i]*nums2[i];

        System.out.println("El producto escalar es "+sum);
    }
    public static void p6(){
        System.out.println("--- Ejercicio 6 ---");
        Scanner reader = new Scanner(System.in);
        int vector[] = {1,2,4,8,16,32,64,128,256,512};
        boolean encontrado=false;
        System.out.print("\uD83D\uDD0D Introduce el numero a buscar: ");
        int num = reader.nextInt();
        int i;
        for(i = 0; i < vector.length; i++){
            if(vector[i]==num){
                encontrado = true;
                break;
            }
        }
        if(encontrado)
            System.out.println(num+" encontrado en posicion "+i);
        else
            System.out.println(num+" no encontrado");
    }
    public static void p7(){
        System.out.println("--- Ejercicio 7 ---");
        int vector[] = {1,2,3,4,5,6,7,20,11,22,12};
        int suma = 0;
        for(int i = 0; i<vector.length-1; i++){
            if (vector[i]>vector[vector.length-1]){ // Comprueba que el numero sea mayo
                suma += vector[i];
            }
        }
        System.out.println("Suma elementos vector mayores que: "+ vector[vector.length-1]+": "+suma);
    }
    public static void p8(){
        System.out.println("--- Ejercicio 8 ---");
        int vector1[] = {1,2,3,4,5,6,7};
        int vector2[] = {1,2,3,4,5,6,7};
        //if(Arrays.equals(vector1,vector2)) System.out.println("Son iguales");
        //else System.out.println("Son distintos");
        for (int i = 0; i < vector1.length; i++){
            if(vector1[i]==vector1[2]){
                continue;
            } else if (i == vector1.length -1) {
                System.out.print("Son iguales");
                continue;
            }
            System.out.print("Son Diferentes");
        }

    }
    public static void p9(){
        System.out.println("--- Ejercicio 9 ---");
        Scanner reader = new Scanner(System.in);
        int grado = reader.nextInt();
        double vector[] = new double[grado+1];
        for (int i = 0; i<grado+1; i++){
            System.out.print("Introduce coeficiente x^"+i+": ");
            vector[i] = reader.nextDouble();
        }
        System.out.print("Introduce el valor de a: ");
        double a = reader.nextInt();
        double Pa = 0;
        for(int i = 0; i<grado + 1; i++)
            Pa = Pa + Math.pow(a,i)*vector[i];

        System.out.print("Valor polinomio en x="+a+" es: "+Pa);

    }
    public static void p10(){
        System.out.println("--- Ejercicio 10 ---");
        Scanner reader = new Scanner(System.in);
        int fila = reader.nextInt();

        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < matriz.length; i++){

        }
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
}
