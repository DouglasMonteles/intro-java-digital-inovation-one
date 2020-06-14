package com.innovation.digital.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExempleList {

	public static void main(String[] args) {
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		
		System.out.println("--- Ordem de inserção ---");
		System.out.println(estudantes);
		
		estudantes.sort((first, second) -> {
			return first.getIdade() - second.getIdade();
		});
		
		System.out.println("--- Ordem crescente pela direfença de idade ---");
		System.out.println(estudantes);
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		
		System.out.println("--- Ordem decrescente pela direfença de idade ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // passagem de referencia de metodo que sera interpretado pelo compilador em tempo de execucao
		
		System.out.println("--- Ordem natural dos numeros 0.. 1.. 2.. 3.. ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		
		System.out.println("--- Ordem reversa dos numeros ---");
		System.out.println(estudantes);
		
		estudantes.forEach(System.out::println);
		
	}
	
}
