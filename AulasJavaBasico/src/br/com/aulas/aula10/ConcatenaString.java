/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula10;

/**
 *
 * @author epquadros
 */
public class ConcatenaString {
    

         
         public static void main (String[] args){
               
                      
               
               /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM OPERADOR '+'
                * ###########################################
                * */
               String strFinal = "";
               long tStart = System.currentTimeMillis();
               /*
                * Vamos concatenar 65536 vezes o caractere 'a',
                * então entenda que cada vez que passarmos no laço
                * a JVM irá criar um novo objeto em memória.
                * */
               for(int i = 0; i < 100000; i ++){
                      strFinal += "a";                  
               }
               
               long tEnd = System.currentTimeMillis();
               long tResult = tEnd - tStart;
               
               System.out.println("Tempo de Execução com operador '+' = "+tResult+" ms");
               
               /*
                * ###########################################
                * FIM BLOCO CONCATENAÇÃO COM OPERADOR '+'
                * ###########################################
                * */
               
               
               
               /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM StringBuilder
                * ###########################################
                * */
               StringBuilder strBuilder = new StringBuilder();
               tStart = System.currentTimeMillis();
               for(int i = 0; i < 100000; i ++){
                      strBuilder.append("a");                 
               }
               tEnd = System.currentTimeMillis();
               tResult = tEnd - tStart;
               System.out.println("Tempo de Execução com StringBuilder= "+tResult+" ms");
               
                 /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM StringBuffer
                * ###########################################
                * */
               
                StringBuffer bb = new StringBuffer();
               tStart = System.currentTimeMillis();
               for(int i = 0; i < 100000; i ++){
                      bb.append("a");                 
               }
               tEnd = System.currentTimeMillis();
               tResult = tEnd - tStart;
               System.out.println("Tempo de Execução com StringBuffer= "+tResult+" ms");
               
               
         }
   
  }
 // Saída provável:
 // Tempo de Execução com operador '+' = 3753 ms
 // Tempo de Execução com StringBuilder = 4 ms
    
    

