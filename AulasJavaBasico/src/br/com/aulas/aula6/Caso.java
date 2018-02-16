/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulas.aula6;

/**
 *
 * @author webeder
 */
public class Caso {

    public static void main(String args[]) throws java.io.IOException  {
System.out.println("Concorda ou não? (s/n) ");
char c  = (char) System.in.read();
switch(c) {
case 's': 
System.out.println("Concorda");
break;
case 'n':
System.out.println("Não concorda");
break;
default: System.out.println("Resposta inválida");
break;
}
}
    
}
