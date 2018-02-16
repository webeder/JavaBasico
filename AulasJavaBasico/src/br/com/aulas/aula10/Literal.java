/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula10;

import java.util.Scanner;

/**
 *
 * @author epquadros
 */
public class Literal {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

  
    
   public static void main(String[] args) {  
         
        String stringDeNomes = "João, Carlos, José, Marcos, Maria, Julia, Joaquim, Ana";
        System.out.println("------- TEXTO ORIGINAL -------");
        System.out.println(stringDeNomes);
        System.out.println();
        
        String[] arrayDeNomes = stringDeNomes.split(", ");
        System.out.println("------- DIVIDINDO O TEXTO ------");

        for(String nome : arrayDeNomes){
               System.out.print(" "+nome);
        }
       
           System.out.println("\n");
          System.out.println("------- SUBSTITUINDO O NONE POR OUTRO  -------");  
           
          for(String nome : arrayDeNomes){              
               nome =  nome.replace("Carlos", "Eder" );
               System.out.print(" "+nome);
        }
        
        
        
         System.out.println("\n");
          System.out.println("------- TEXTO EM MAISCULO -------");
          
          String tt = "";
          
         for(String nome : arrayDeNomes){
             
             tt += " "+nome.toUpperCase(); 
             
              System.out.print(" "+nome.toUpperCase()); 
         }
         
           System.out.println("\n");
          System.out.println("------- TEXTO EM Minusculo -------"); 
          
           System.out.print(" "+tt.toLowerCase()); 
    
          
  System.out.println("\n");
  
                /* multi-line 
                * A nossa string abaixo é um uso ideal para o operador '+', 
                * pois não estamos criando nenhum novo objeto em memória, 
                * apenas melhorando a
                * legibilidade do código.
                * */
               String strFinal = "Teste " +
                                            "de Strings " +
                                            "para alunos "+
                                            "do curso de java "+
                                            "básico...";
               
               //Também poderiamos usar desta forma sem 
               //prejudicar a performance do programa
               int e = 60;
               int i = 50;
               System.out.println(strFinal+" x:"+e+" y:"+i);
         }
  
  
  
    }


   
     
  

       

    

