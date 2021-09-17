package com.company;

import java.util.Scanner;

public class Operaciones{

    //Atributos
    int calificaciones[] = new int [5];
    double acumulador=0;
    String nombre;

    //Pide Calificiones
    public void pideCal(){
        Scanner tecla;
        tecla = new Scanner(System.in);
        System.out.println("Cuál es tu nombre?: ");
        nombre=tecla.next();
        //COn un for va recorriendo el array y guardando la calificación en el lugar que vaya el for
        for (int x=0; x<calificaciones.length ; x++){
            System.out.println("Calificación número "+ (x+1) + ": ");
            calificaciones[x]=tecla.nextInt();
        }
    }

    //Para calcular el promedio
    public double Promedio(){
        //Primero generamos un acumulador
            for (int x=0; x<calificaciones.length ; x++) {
                acumulador= calificaciones[x]+ acumulador;
            }

            //Después podemos proceder a la operación
            acumulador= acumulador/5;
            //Retornamos
            return acumulador;
    }


    public void Imprimir(){
        //Con un for va recorriendo el array
        //Dependiendo de la calificación se clasifica
        for (int x=0; x<calificaciones.length ; x++) {
            System.out.println("Calificación número " + (x+1) + ": ");
            if (calificaciones[x]<=50){
                System.out.println("F");}
            else if (calificaciones[x]<=60){
                System.out.println("E");}
            else if (calificaciones[x]<=70){
                System.out.println("D");}
            else if (calificaciones[x]<=80){
                System.out.println("C");}
            else if (calificaciones[x]<=90){
                System.out.println("B");}
            else
                System.out.println("A");

            }
        System.out.println("Gracias " + nombre);

    }
}
