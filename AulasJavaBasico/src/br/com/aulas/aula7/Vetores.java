/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula7;

/**
 *
 * @author webeder
 */
public class Vetores {
    
 public static void main(String[] args) {  
     
     String[] linha = new String[10];
     String[] coluna = new String[linha.length];
        linha[5] = "teste";
    
     
     for (int i=0;i<linha.length ;i++){
  
       System.out.print("--"+i+"--|");
     }
     

     
     for (int i=0;i<linha.length ;i++){
        if (i<=10){
        System.out.println("--"+i+"--|");
        }
        for (int e=0;e<coluna.length ;e++){
        if (e<10){
        System.out.print("-----|");
        }
       
      
      /* for (int x : linha.length ) {
            System.out.println(x);
        }
       
       */
     }
     }
  //System.out.print(linha[5]);
     System.out.println("");
     System.out.println("");
 }
 
 
}

     
     
         
        
   /*
            
             
                if (e<10){
                    System.out.print(e);
                }
             
                System.out.print("----|");
                 
            
              System.out.print("----|");
   
     }*/
     
     
     
  
    
    

