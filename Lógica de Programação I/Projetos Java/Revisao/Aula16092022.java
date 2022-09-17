/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16092022;

import java.util.Scanner;

/**
 *
 * @author f290ti
 */
public class Aula16092022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        System.out.println("X:"+StaticClass.x);
        StaticClass.metodoEstatico();
        */
        
        Scanner sc;
        double valor1, valor2;
        
        sc = StaticClass.receberTeclado();
        
        System.out.println("Digite um valor:");
        valor1 = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        valor2 = sc.nextDouble();
        
        StaticClass.soma(valor1, valor2);
        StaticClass.divisao(valor1, valor2);
        StaticClass.potencia(valor1, valor2);
        
    }
    
}
