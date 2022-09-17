/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16092022;

import java.util.Scanner;

/**
 *
 * @author f290ti
 */
public class StaticClass {
    /*
    public static final int x = 10;
    
    public static void metodoEstatico (){
        System.out.println("Metodo estatico");
    }
    */
    
    public static void soma(double valor1, double valor2){
        System.out.println("Soma: "+(valor1 + valor2));
    }
    
    public static void divisao(double valor1, double valor2){
        System.out.println("Divisao: "+(valor1 / valor2));
    }
    
    public static void potencia(double base, double expoente){
        double resultado = Math.pow(base, expoente);
        System.out.println("Potencia: "+resultado);
    }
    
    public static Scanner receberTeclado(){
        Scanner sc = new Scanner (System.in);
        return sc;
    }
    
}
