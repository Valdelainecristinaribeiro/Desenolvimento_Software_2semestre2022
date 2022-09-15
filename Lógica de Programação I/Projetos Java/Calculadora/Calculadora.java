/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author valde
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Funcoes f = new Funcoes();
        double num1, num2, num3, multi, somar, sub1, sub2, divi;
        
        System.out.println("Somando: ");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        somar = f.somar(num1, num2);
        System.out.println("Resultado da soma dos dois primeros números: "+somar);
        
        System.out.println("===============");
        System.out.println("Subtraindo: ");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextDouble();
        sub1 = f.subtrair(num1, num2);
        sub2 = f.subtrair2(num1, num2, num3);
        System.out.println("Resultado da subtração dos dois primeiros números: "+sub1);
        System.out.println("Resultado da soma do num3 e subtação dos dois primeiros: "+sub2);
        
        System.out.println("================");
        System.out.println("Multiplicando: ");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        multi = f.multiplicar(num1, num2);
        System.out.println("Resultado da multiplicação: "+multi);
        
        System.out.println("================");
        System.out.println("Dividindo: ");
        System.out.println("Digite o primeiro número para o dividendo: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número para o divisor: ");
        num2 = sc.nextDouble();
        
        if(num2 > 0){
            divi = f.dividir(num1, num2);
            System.out.println("Resultado da divisão: "+divi);
        }else{
            System.out.println("Não é posivel dividir por 0!");    
        }
        
    }
}
