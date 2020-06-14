package com.innovation.digital.set;

import java.util.TreeSet;

public class ExempleTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		// monta a arvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// retorna a primeira capital do topo da lista
		System.out.println(treeCapitais.first());
		
		// retorna a ultima capital do final da lista
		System.out.println(treeCapitais.last());
		
		// retorna a primeira capital abaixo na arvore de capital parametrizada
		System.out.println(treeCapitais.lower("Florianopolis"));
		
		// retorna a primeira capital acima na arvore de capital parametrizada
		System.out.println(treeCapitais.higher("Florianopolis"));
		
		// exibe todas as capitais no console 
		System.out.println(treeCapitais);
		
		// retorna a primeira capital no topo da arvore, removendo do set
		System.out.println(treeCapitais.pollFirst());
		
		// retorna a primeira capital no final da arvore, removendo do set
		System.out.println(treeCapitais.pollLast());
		
		System.out.println(treeCapitais);
		
	}
	
}
