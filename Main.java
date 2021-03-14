//É importante importar algumas bibliotecas do java :)

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Main {
  public static void main(String[] args) {

    //Criando uma lista de nomes (Array de nomes)
    List<String> nomes = new ArrayList<>();
    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");
    nomes.add("Juliano");

    //Verificando a quantidade de item da lista
    int t = nomes.size();
    System.out.println(t);

    //Imprimindo os itens da lista   
    for(int i=0 ; i< t ;i++ ){
      System.out.println(nomes.get(i));
    }

    //Imprimindo um determinado elemento da lista
    nomes.set(2,"Roberto");

    //Removendo um determinado elemento da lista
    nomes.remove(4);

    //removendo o nome Joao da lista Nomes
    nomes.remove("João");

    System.out.println("O nome da posicao 1 é: " + nomes.get(1));

    System.out.println("A lista ficou assim... ");

    int q = nomes.size();

    for(int i=0; i<q ; i++){
      System.out.println(nomes.get(i));
    }
    //imprimindo a quantidade de itens da lista nomes
    int quantidadeItensLista = nomes.size();
    System.out.println("A lista nomes tem: "+ quantidadeItensLista + " nomes.");
    

    //Verificando se a Lista nomes tem o nome Juliano
    for(int i=0; i<q ; i++){
      if (nomes.get(i) == "Juliano") {
        System.out.println(nomes.get(i));
      }   
    }

    //Criando uma lista nova com os nomes Ismael e Rodrigo
    List<String> listaNova = new ArrayList<>();

    listaNova.add("Ismael");
    listaNova.add("Rodrigo");

    System.out.println("A nova lista: "+ listaNova);

    //Adicionando os elementos da lista nomes para a lista nova
    for(int i = 0; i< q; i++){
      listaNova.add(nomes.get(i));
    }
    System.out.println("A lista nova com os elementos da lista nomes: "+listaNova);

    //Ordenando em ordem alfabética os elementos da lista nova
    Collections.sort(listaNova);

    System.out.println("A lista nova em ordem alfabética: "+ listaNova);

    //Verificando se a lista está vazia
    boolean listaVazia = listaNova.isEmpty();
    System.out.println("A lista está vazia? "+ listaVazia);

    //Limpando a lista 
    listaNova.clear();

    boolean aListaVazia = listaNova.isEmpty();
    System.out.println("E agora? A lista está vazia? "+ aListaVazia);








  }
}