package com.innovation.digital.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleStreamAPI {

	public static void main(String[] args) {
		
		// cria a colecao de estudantes
		List<String> estudantes = new ArrayList<>();
		
		// adiciona 7 estudantes na colecao
		estudantes.add("Pedro");
		estudantes.add("Thavse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		
		// retorna a contagem de elementos do stream
		System.out.println("Contagem: " + estudantes.stream().count());
		
		// retorna o elemento com maior numero de letras
		System.out.println("Maior numeros de letras: " + estudantes
			.stream()
			.max(Comparator.comparingInt(String::length)));

		// retorna o elemento com menor numero de letras
		System.out.println("Menor numero de letras: " + estudantes
			.stream()
			.min(Comparator.comparingInt(String::length)));
		
		// retorna os elementos com a letra 'r' no nome
		System.out.println("Elementos com r no nome: " + estudantes.stream()
			.filter((estudante) ->  estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		// retorna uma nova colecao, com os nomes concatenados a quantidade de letra de cada nome
		System.out.println("Retorna uma nova colecao com a qtd de letra: " + estudantes.stream().map(estudante -> {
			return estudante.concat(" - ").concat(String.valueOf(estudante.length()));
		}).collect(Collectors.toList()));
		
		// retorna somente os 3 primeiros elementos da colecao
		System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3)
				.collect(Collectors.toList()));
		
		// exibe cada elemento no console, e depois retorna a mesma colecao
		System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println)
				.collect(Collectors.toList()));
		
		// exibe cada elemento no console, sem retornar outra colecao
		System.out.println("Retorna os elementos");
		estudantes.stream().forEach(System.out::println);
		
		// retorna true se todos os elementos possuem a letra w
		System.out.println("Todos os elementos tem w no nome? " + estudantes.stream().allMatch((elemento) -> 
			elemento.toLowerCase().contains("w")));
		
		// retorna true se algum elemento possui a letra a minuscula
		System.out.println("Tem algum elemento com a no nome? " + estudantes.stream().anyMatch((elemento) -> 
			elemento.toLowerCase().contains("a")));
		
		// retorna true se nenhum elemento possui a letra a minuscula no nome
		System.out.println("Nao tem nenhum elemento com a no nome? " + estudantes.stream().noneMatch(elemento -> {
			return elemento.contains("a");
		}));
 
		// retorna o primeiro elemento da colecao, se existir exibe no console
		System.out.println("Retorna o primeiro elemento da colecao: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		// exemplo de operacao encadeada
		System.out.println("Opecarao encadeada:");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> 
						estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter((estudante) -> 
						estudante.toLowerCase().contains("r"))
				.collect(Collectors.toList()));
//					.collect(Collectors.joining(", ")));
//					.collect(Collectors.toSet()));
//					.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
		
	}

}
