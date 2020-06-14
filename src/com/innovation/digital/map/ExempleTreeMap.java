package com.innovation.digital.map;

import java.util.TreeMap;

public class ExempleTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		
		// monta a arvore com as capitais
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianopolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "Sao Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// retorna a primeira capital no topo da arvore
		System.out.println(treeCapitais.firstKey());
		
		// retorna o ultima capital no final da arvore
		System.out.println(treeCapitais.lastKey());
		
		// retorna a primeira capital abaixo na arvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));
		
		// retorna a primeira capital acima na arvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));
		
		treeCapitais.forEach((chave, valor) -> {
			System.out.println(chave + "=" + valor);
		});
		
	}
	
}
