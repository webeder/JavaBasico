package br.com.aulas.aula7;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * site de referencia 
 * https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 * 
 */


/**
 *
 * @author webeder
 */
public class ArrayListas {



    
    public static void main(String[] args){
            ArrayList<String> bandas = new ArrayList<String> ();
            
            bandas.add("Rush");
            System.out.print( "Adicionando a banda Rush: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            bandas.add("Beatles");
            System.out.print( "Adicionando a banda Beatles: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            bandas.add("Iron Maiden");
            System.out.print( "Adicionando a banda Iron Maiden: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Quem está na índice 0: " );
            System.out.println( bandas.get(0) );
            
            System.out.print( "Adicionando Tiririca onde estava o Rush: " );
            bandas.add( bandas.indexOf("Rush"), "Tiririca");
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Número de elementos na lista: " );
            System.out.println( bandas.size() );
            
            System.out.print( "Removendo o Tiririca: " );
            bandas.remove("Tiririca");
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Removendo tudo: " );
            bandas.clear();
            System.out.println( Arrays.toString( bandas.toArray() ) );
        }

}


/*Importe:
import java.util.ArrayList;
Por ser um tipo diferente, sua sintaxe é um pouco diferente do que você já viu até então:

ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();

No exemplo a seguir, vamos usar um ArrayList de String para trabalhar com o nome de várias Bandas de música:
ArrayList<String> bandas = new ArrayList<String> ();


Exemplo de uso do ArrayList
Após declarar a ArrayList 'bandas' que armazenará Strings, vamos adicionar alguns nomes.
Primeiro adicionamos a banda "Rush":
bandas.add("Rush");

Existe um método do ArrayList chamado 'toArray()' que coloca todos os elementos de um ArrayList em um Array.
Ou seja: bandas.toArray() é um Array!

Porém, já vimos que existe um método 'toString' da classe Arrays que retorna uma String com os elementos de um Array. Vamos usar esse método parar exibir todos os elementos do ArrayList, que transformamos em Array através do método 'toArray()':
Arrays.toString( bandas.toArray() );

Vamos adicionar a segunda banda, "Beatles" e imprimir, usando o mesmo método.
Note que quando usamos 'add', sempre adicionamos o elemento pro fim da ArrayList.
Confirme isso agora, vendo que a banda "Iron Maiden" ficará depois de "Beatles".

Vamos pegar o primeiro elemento, o elemento '0', através do método 'get':
bandas.get(0);

Note que é a banda "Rush", pois ela foi a primeira a ser adicionada.

Vamos adicionar o "Tiririca" na posição do "Rush", ou seja, na posição '0':
bandas.add(0,"Tiririca");
ou
bandas.add( bandas.indexOf("Rush"), "Tiririca");

Pois o método 'indexOf' retorna o índice em que ocorre "Rush".

Para saber o tamanho que tem seu ArrayList, basta usar o método 'size()':
bandas.size();

Feito isso, rapidamente remova o "Tiririca", pois alguém pode ver.
Para tal, use o método 'remove':
bandas.remove("Tiririca");

Ok. Não quer mais brincar de ArrayList? Remova tudo
bandas.clear();
*/