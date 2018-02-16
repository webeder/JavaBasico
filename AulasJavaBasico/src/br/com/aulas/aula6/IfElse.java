/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula6;

import java.util.Scanner;

/**
 *
 * @author webeder
 */
public class IfElse {
    
      public static void main(String[] args) {   
           System.out.println("Digite o valor de 1 ou mais!");
          
           Scanner sc = new Scanner(System.in);
           
           int a = sc.nextInt(); 
 
        // int numero;
       //   numero = Integer.parseInt(a);
          
          if (a==1){
              System.out.println("Verdadeiro");
          }else{
              System.out.println("Falso"); 
          }
          
      }
    
    
}
