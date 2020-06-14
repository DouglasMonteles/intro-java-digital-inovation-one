package com.innovation.digital.optional;

import java.util.Optional;

public class ExempleOptionalEstados {

	public static void main(String[] args) {
		/*
		 * Optional.of -> não recebe valor nulo: NullPointerException
		 * Optional.ofNullable -> se for null, controi vazio, senao constroi com valor
		 * */
		
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor opcional que esta presente");
		optionalString.ifPresentOrElse(System.out::printf, () -> System.out.println("não esta presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor opcional nao esta presente");
		optionalNull.ifPresentOrElse(System.out::printf, () -> System.out.println("null = não esta presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println("Valor opcional que nao esta presente");
		emptyOptional.ifPresentOrElse(System.out::printf, () -> System.out.println("empty = não esta presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		
		System.out.println("Valor opcional que esta presente");
		optionalNullErro.ifPresentOrElse(System.out::printf, () -> System.out.println("erro = não esta presente"));
		
	}
	
}
