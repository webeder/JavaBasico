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
public class textBuffer {

       public static void main(String[] args) { 
    
                /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM OPERADOR '+'
                * ###########################################
                * */           
           
           
           StringBuffer bb = new StringBuffer(); 
    
           bb.append("Eu escrevo um texto");
           bb.append(",mas está concatenado.");
           bb.append("Por isso ele aparece todo junto!");
           System.out.println(bb.toString());
           
           
         System.out.println("\n poderia fazer assim "+"com o sinal de mais para concatenar");
         /*  
         Como você já deve ter percebido, a String não deve ser usada para 
         concatenação de outras Strings ou caracteres. Na seção acima apenas 
         falamos sobre o quão prejudicial pode ser o seu uso, mas agora vamos
         comparar tal uso com o StringBuilder, que é a maneira correta de concatenar
         Strings ou caracteres.
         Vamos usar o mesmo exemplo com o teste seguinte com algumas modificações para vermos 
         de fato a velocidade de execução do StringBuilder e do String em concatenar valores,
         agora sim ficará nítido a diferença entre estes.  
          */
    
       }
    
    
}
