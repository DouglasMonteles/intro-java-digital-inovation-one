package com.innovation.digital.set;

import java.util.LinkedHashSet;

public class ExempleLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		// adiciona os numeros no set
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(11);
		
		System.out.println(sequenciaNumerica);
		
		// remove o numero do set
		sequenciaNumerica.remove(4);
		
		// retorna a qtd de itens do set
		System.out.println(sequenciaNumerica.size());
		
		// navega em todos os itens do iterator
		sequenciaNumerica.forEach(numero -> {
			System.out.println(numero);
		});
		
		// retorna se esta vazio ou nao
		System.out.println(sequenciaNumerica.isEmpty());
		
	}
	
}
