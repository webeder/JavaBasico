/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula3;

/**
 *
 * @author webeder
 */
public class Tipos {
    
       public static void main(String[] args) {
       
      int inteiro = 15 ;                    // 1 , 2, 3 ... inteiro 4 bytes 2*109 
      double numeroComVirgula = 2.22 ;      // 2.23 ,32.2 ... Decimal doble 8 bytes muito grande
      String texto = "meu texto";           // Meu texto  Carácter simple 2 bytes
      char letra = 'A';                     // A ou B         Carácter simple 2 bytes
      boolean VF = true ;                   // verdadeiro ou falso   
      long numeroGrande = 456465;           // Entero 8 bytes muito grande 
      float flutuante = 123555;            // Decimal simple muito grande
        
      System.out.println("Numero: "+inteiro);
      System.out.println("double: "+numeroComVirgula);
      System.out.println("texto: "+texto);
      System.out.println("letra: "+letra);
      System.out.println("Verdadeiro ou falso: "+numeroGrande);
      System.out.println("Numero grande: "+numeroGrande);
      System.out.println("flutuante: "+flutuante);
        
        
     }
    
    
    
}
