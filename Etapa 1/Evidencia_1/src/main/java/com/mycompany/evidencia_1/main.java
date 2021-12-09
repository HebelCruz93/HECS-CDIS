/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_1;
//Librerias
import java.util.Scanner;

/**
 *
 * @author HEBEL
 */
//Clase principal
public class main {
    
    //Método main
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingresa tu nombre");
       //Variable primitiva
       String nombre = entrada.nextLine();
       System.out.println("Ingresa un numero entero");
        //Variable primitiva
       int numeroEntero = entrada.nextInt();
       System.out.println("Ingresa un numero decimal");
        //Variable primitiva
       double numeroDecimal = entrada.nextDouble();
       
       //Operacion Suma
       double suma = numeroEntero + numeroDecimal;
       //Impresión en consola
       System.out.println("Hola "+nombre+", el resultado de la suma entre "+numeroEntero+
               " y "+numeroDecimal+" es "+suma+". Donde "+"\""+nombre+"\"" +" es el valor del nombre, "+
               "\""+numeroEntero+"\"" +" es el valor del número entero y "+"\""+numeroDecimal+"\"" +
               " es el valor del número decimal.");
       
       
       
   }  
   
}

