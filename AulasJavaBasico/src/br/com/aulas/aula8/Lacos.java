/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author webeder
 */
public class Lacos {
    
    public static void main(String args[]){
        
        
    List values = new ArrayList();

values.add("Um");
values.add("Dois");
values.add("Tres");


//#0
 System.out.println("Exemplo: for(Object value : values) percorre sem necessidade de passar o tamanho ");
for(Object value : values) {
    System.out.println("value1: "+value);
           
}

//#1
 System.out.println("\n");
  System.out.println("Exemplo: for percorre até o tamanho do values.size() ");
for(int i = 0; i < values.size(); i++) {
    //cast conversão veremos mais tarde 
    String value2 = (String) values.get(i);
    System.out.println("value2 "+value2);
}
  System.out.println("\n");
//#2


/*Nota: Apenas um ponto interessante: usar iterator eh mais rapido quando voce precisa pegar 
todos os itens, os uma sequencia deles.. agora, se vc precisar apenas do item X, nao vai 
fazer diferenca o uso do metodo get() ou iterar pelos elementos.
O problema com get(), quando queremos ir de item em item, eh que ele sempre comeca do 0 a cada loop, 
ao contrario do iterator(), que guarda o ultimo elemento visitado.*/

 System.out.println("Exemplo:  for(Iterator it = values.iterator(); it.hasNext())");
for(Iterator it = values.iterator(); it.hasNext(); ) {
    String value3 = (String) it.next();
    System.out.println("value3 "+value3);
}
    
    System.out.println("\n"); 
    System.out.println("Exemplo:  while executa sempre que a condição for verdadeira");
    
Iterator it = values.iterator();
while (it.hasNext()) {
    String value4 = (String) it.next();
    System.out.println("value4 "+value4);
}
        
    }
    
   
    
}
