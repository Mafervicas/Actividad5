package com.company;

import java.util.Scanner;

//Programa de Calificaciones
//Mafer Villegas
public class Main {

    public static void main(String[] args) {
	//Inicializamos variables
        Scanner tecla;
        tecla = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("       Bienvenido");
        System.out.println("Aquí calcularemos tu promedio");
        System.out.println("");

    //Ahora sí vamos a pedirle el usuario las calificaciones
        //Está dentro de un for que irá recorriendo el array y guardando la info
        Operaciones cali= new Operaciones();
        cali.pideCal();
        System.out.println("");
        //Para el promedio unicamente usa un acumulador y después lo divide / 5
        System.out.println("El promedio es: ");
        System.out.println(cali.Promedio());
        System.out.println("");
        //Aquí manda llamar el método de Imprimir y listo
        System.out.println("Estas fueron las calificaciones:");
        cali.Imprimir();


     }
}
