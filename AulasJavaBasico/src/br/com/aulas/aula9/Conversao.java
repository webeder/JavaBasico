/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula9;

import java.util.Scanner;
  
/**
 *
 * @author epquadros
 */
public class Conversao {
    
   private  boolean var; 
   
   public static void main(String[] args) {   
           System.out.println("Digite o valor de 1 ou mais!");
          
           Scanner sc = new Scanner(System.in);
           
           String a = sc.nextLine();
 
             int numero;
             numero = Integer.parseInt(a);
     
       int numero1 = numero;
    
           if (numero==1){
              System.out.println("Verdadeiro");
          }else{
              System.out.println("Falso"); 
          }  
          
        String viraNumero = Integer.toString( numero );
      
        
        if (viraNumero.isEmpty()){
            System.out.println("Vazio: "+viraNumero);  
        }
            System.out.println("cheio: "+viraNumero);  
      }
        
       
    
    
    
    
}
