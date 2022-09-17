/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16092022;

/**
 *
 * @author f290ti
 */
public class Revisao {
    
    private int x;
    private double d;
    private String s;
    
    // IF - condicinais
    public void metodoIF(){
        if(x < 0){
            System.out.println("Numero negativo!");
        }
    }
    
    public void metodoIFElse(){
        if(x < 0){
            System.out.println("Numero negativo!");
        }else{
            System.out.println("Numero positivo!");
        }
    }
    
    public void metodoIfElseIf(){
        if(x >0 && x <= 10){
            System.out.println("X entre 0 e 10.");
        }else if(x > 10 && x <= 20){
            System.out.println("X entre 11 e 20.");
        }else{
            System.out.println("X menor que 0 ou maior que 20!");
        }
    }
    
    public void metodoSwitch(){
        int opcao = 0;
        
        switch(opcao){
            
            case 1:
                System.out.println("Caso 1");
                break;
                
            case 2:
                System.out.println("Caso 2");
                break;
            
            default:
                System.out.println("Fora das opcoes");
        }
    }
    
    public void metodoFor(){
        int j;
        
        for(int i=0; i<=2; i++){
            j = x;
            System.out.println("Valor de j: "+j);
        }
    }
    
    public void metodoWhile(){
        while(x < 10){
            System.out.println("X: "+x);
            x++;
        }
    }
    
}
