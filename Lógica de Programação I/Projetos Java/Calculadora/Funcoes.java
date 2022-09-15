/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author valdelaine
 */
public class Funcoes {
    private double somar;
    private double subtrair2;
    private double subtrair;
    private double multiplicar;
    private double divisao;
    
    public double somar(double num1, double num2){
        double resultado;
        resultado = num1 + num2;
        return resultado;
    }
    
    public double subtrair(double num1, double num2){
        double resultado;
        resultado = num1 - num2;
        return resultado;
    }
    
    public double subtrair2(double num1, double num2, double num3){
        double resultado;
        resultado = num1 - num2;
        resultado = resultado + num3;
        return resultado;
    }
    
    public double multiplicar(double num1, double num2){
        double resultado;
        resultado = num1 * num2;
        return resultado;
    }
    
    public double dividir(double num1, double num2){
        double resultado;
        resultado = num1 / num2;
        return resultado;
    }
     
}
