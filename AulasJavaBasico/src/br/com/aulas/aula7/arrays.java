/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula7;

import java.util.Arrays;

/**
 *
 * @author webeder
 */
public class arrays {
    
    public static void main(String[] args) {
    int[] idades = new int[10];
    
    for (int i = 0; i < 10; i++) {
        idades[i] = i * 10;
    }
    for (int i = 0; i < 10; i++) {
        System.out.print(" "+idades[i]);
         
    }
    System.out.println("\n");
    
    
System.out.println("\n Até onde o for deve ir? Toda array em Java \n" +
"tem um atributo que se chama length, \n" +
"e você pode acessá-lo para saber o tamanho do array ao qual \n" +
"você está se referenciando naquele momento: \n");
     
  for (int i = 0; i < idades.length; i++) {
        System.out.print(idades[i]);
    }
  
     System.out.println("\n \n Não precisamos mais do length para percorrer matrizes cujo tamanho não conhecemos: \n");
  
        // imprimindo toda a array
        for (int x : idades) {
            System.out.print(x);
        }
  
        System.out.println("\n");
    
        Object[] objArr1 = {"1","2","3"};
        Object[] objArr2 = {"4","5","6"};
        
        //adicionando um elemento no array 
        Object[] objArr = add(objArr1, "1");
        System.out.println(Arrays.toString(objArr));
        
       //add dois arrays para print juntos 
        objArr = add(objArr1, objArr2);
        System.out.println(Arrays.toString(objArr));
        
    }
    
   
    public static Object[] add(Object[] arr, Object... elements){
        Object[] tempArr = new Object[arr.length+elements.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        
        for(int i=0; i < elements.length; i++)
            tempArr[arr.length+i] = elements[i];
        return tempArr;
        
    }
    
    
}
  
 
    
   
  

    
    
    

