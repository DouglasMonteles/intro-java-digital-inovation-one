package com.innovation.digital;

import java.util.stream.IntStream;

public class Teste {

	public static void main(String[] args) {
	
		/*var nome = "Douglas 123"; 
		
		for (var letra : nome.toCharArray()) {
			System.out.println(letra);
		}
		
		System.out.println(nome.toCharArray());*/
		int[] num = {1, 3, 4, 6, 2, 4};
		
		IntStream.of(num).forEach(n -> {
			System.out.println(n);
		});
		
		IntStream.range(0, 3).forEach(n -> {
			System.out.println(n);
		});
		
		System.out.println(String.CASE_INSENSITIVE_ORDER.compare("nomw", "Nomw"));
		
	}
	
}
