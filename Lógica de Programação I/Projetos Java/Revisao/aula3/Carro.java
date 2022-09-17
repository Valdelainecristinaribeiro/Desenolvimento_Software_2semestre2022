/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author f290ti
 */
public class Carro {
    
    //atributos globais
    private int rodas = 4;
    private int portas = 4;
    private String placa = "ABC 1234";
    private String cor = "prata";
    private boolean gasolina = true;
    
    // metodos
    
    //imprimir
    public void imprimir(){
        System.out.println("Portas: "+portas);
        System.out.println("Rodas: "+rodas);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placa);
    
    }
    public static void main(String [] args) {
        
    }
}
