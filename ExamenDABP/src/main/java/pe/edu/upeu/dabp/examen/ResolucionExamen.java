package pe.edu.upeu.dabp.examen;

import java.util.Scanner;

import pe.edu.upeu.dabp.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado teclado = new LeerTeclado();

    //Ejercicio 01
    public void ImpuestosDeAutomoviles() {
        int numero;
        double total1 = 0, total2 = 0, total3 = 0, total_final = 0;
        for(int j = 1; j <= 3;j++) {
            numero = teclado.leer(0, "Ingrese la cantidad de autos en la "+j+" categoria: ");
            if(numero>0) {
                for(int i = 0; i < numero; i++) {
                    if (j == 1) {
                        double categoria1[] = new double[numero];
                        categoria1[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total1 += categoria1[i] * 0.1;
                        System.out.println("El 10% es: "+total1);
                    }else if(j == 2) {
                        double categoria2[] = new double[numero];
                        categoria2[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total2 += categoria2[i] * 0.07;
                        System.out.println("El 7% es: "+total2);
                    }else{
                        double categoria3[] = new double[numero];
                        categoria3[i] = teclado.leer(0, "Ingrese el costo del "+(i+1)+" auto: ");
                        total3 += categoria3[i] * 0.05;
                        System.out.println("El 5% es: "+total3);
                    }
                }
            }else{System.out.println("El número es incorrecto");}
        }
        total_final = total1 + total2 + total3;
        System.out.println("El total de la categoria 1 es: "+total1);
        System.out.println("El total de la categoria 2 es: "+total2);
        System.out.println("El total de la categoria 3 es: "+total3);
        System.out.println("El total en general de las 3 categorias es: "+ total_final);
    }

    //Ejercicio 02
    public void  TablaDeMultiplicar() {
        int total = 0;
        for(int n = 1;n <= 20; n ++) {
            System.out.println("la tabla de multiplicar del " + n +": \n");
            for(int i = 1;i <= 10; i++) {
                total = n * i;
                System.out.println(n + "x" + i + "=" + total);
            }
            System.out.println("\n");
        }
    } 

    //Ejercicio 03
    public void NumeroPerfecto(int n){
        int i = 1;
        while(i < n){
            if(n%i == 0){
                System.out.println("los n divisores propios son: " + i);
            }else{
            }
            i++;
        }
    }

    //Ejercicio 04
    public int potencRecur(int base, int exponente) {
        if(exponente == 0) {
            return 1;
        }else{
            return base * (int)Math.pow(base,exponente - 1);
        }
    }
}