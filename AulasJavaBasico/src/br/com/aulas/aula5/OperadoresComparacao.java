/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula5;

/**
 *
 * @author webeder
 */
public class OperadoresComparacao {
    
        public static void main(String[] args) {   
        int a = 10;
        int b = 5;
        String c = "c";    
          
          if (a == 10){
              System.out.println(" == Sinal de igual ");   
        }
          if (a > b){
              System.out.println(" > sinal de maior");   
        }
          if (b < a){
              System.out.println(" < sinal de menor");   
        }
          if (b <= 8){
              System.out.println(" <= sinal de maior ou igual");   
        } 
          if (b >= b){
              System.out.println(" >= sinal de maior ou igual");   
        } 
          if (b != b){ // <> tem em outras linguagens exemplo PHP 
              System.out.println(" != sinal de diferente");   
        } 
          if (c.equals("c")){ // <> tem em outras linguagens exemplo PHP 
              System.out.println(" (equals) sinal de igualdade");   
        } 
          
          boolean result = (a == 10) || (b==5); 
          System.out.println("result é verdadeiro");  
          
          boolean verdadeiro = true;
          boolean falso  =  false; 
          
            System.out.println(verdadeiro && falso);  
             System.out.println(verdadeiro ^ falso);  
               System.out.println(verdadeiro || falso); 
                
          
          
/*= (sinal de igual)

Igual a

a1=b1

> (sinal de maior)

Maior que

a1>b1

< (sinal de menor)

Menor que

a1<b1

>= (sinal de maior ou igual)

Maior ou igual a

a1>=b1

<= (sinal de menor ou igual)

Menor ou igual a

a1<=b1

<> (sinal de diferente)

Diferente de

a1<>b1
           */
            
            
            
        }
    
}
