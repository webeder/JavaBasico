/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula4;

/**
 *
 * @author webeder
 */
public class OperadoresAritmeticos {
    
    
       public static void main(String[] args) {
           
           System.out.println("\n ------------------- EXEMPLO OPERADORES MATEMATICOS ---------------------\n");
           int resultado = 1 + 2 ; 
           
           resultado = resultado + 10; 
           
           System.out.println(" + Resultado: "+resultado);
            
           resultado = resultado / 10; 
           
           System.out.println(" / Resultado: "+resultado);
            
           resultado = resultado * 10; 
           
           System.out.println(" x Resultado: "+resultado);
              
           resultado = resultado - 10; 
           
           System.out.println(" - Resultado: "+resultado);
           
            
           int var = 10;
           int var2 = var++;
           System.out.println(" ++ mais: "+var2++);
           
           
           System.out.println("\n ------------------- EXEMPLO DEPRECIAÇÃO DE INFORMATICA ---------------------\n");
           
           double por = 533.30; 
           
      double aquisicao = 199.00; 
     
       
           
           
      double res = (aquisicao / 60); 
      
    System.out.println("Vlr Aquisição:               "+ aquisicao);
      
      
    System.out.println("Taxa quota:                  "+ res);
      
    int  Cotameses = 59; 
    System.out.println("Total de quotas depreciadas: "+Cotameses);
      
    double acumulado = res * Cotameses;  // cota mes mais total de meses 
      
    System.out.println("Acumulado:                   "+acumulado);
     double residual =  aquisicao - acumulado;  
    System.out.println("Vlr residual:                "+ residual);     
          // resto da divisao 
    double  resto  = ( acumulado % 2 );
              /*   
            double num1 = 103.33;
            double num2 = 2;
            double res = num1 / num2;
            double resto = num1 % num2;*/
         
          System.out.println("resto da divisão:            "+ resto);
          
          double total =  resto * Cotameses ; 
          
           System.out.println("Total do resto               "+total);
              
   System.out.println("\n ------------------------------------------------------------------\n");         
       }
    
}

