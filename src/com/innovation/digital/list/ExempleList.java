package com.innovation.digital.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Lucas");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Maria");
		nomes.add("João");
		
		System.out.println(nomes);
		
		Collections.sort(nomes); // ordem alfabetica
		
		System.out.println(nomes);
		
		nomes.set(2, "José"); // altera um elemento da lista com base no indice
		
		System.out.println(nomes); // 'Carlos' é alterado para 'José'
		
		nomes.remove(3); // remove o elemento da lista com base no indice
		
		System.out.println(nomes); // 'Maria' não pertence mais a lista 
		
		nomes.remove("João"); // remove o objeto da lista
		
		System.out.println(nomes); // 'João foi removido da lista'
		
		var nome = nomes.get(2); // retorna o nome da lista com base no indice
		
		System.out.println(nome); // 'Pedro'
		
		var tamanho = nomes.size(); // retorna o tamanho da lista
		
		System.out.println(tamanho); // 3
		
		var isAnderson = nomes.contains("Anderson"); // retorna um boleano true se a lista tiver o obj informado
		
		System.out.println(isAnderson); // false
		
		Iterator<String> item = nomes.iterator(); // itera sobre a lista de nomes
		
		while (item.hasNext()) { // retorna true enquanto a lista tiver elementos
			System.out.println("--> " + item.next()); // imprime esse elemento
		}
		
	}
	
}
