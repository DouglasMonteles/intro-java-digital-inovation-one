package com.innovation.digital.map;

import java.util.HashMap;
import java.util.Map;

public class ExempleHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
		
		// adiciona os campeoes mundiais fifa no mapa
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Italia", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("Franca", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundiaisFifa);
		
		// atualiza o valor para a chave Brasil
		campeoesMundiaisFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundiaisFifa);
		
		// retorna o valor da chave Argentina
		System.out.println(campeoesMundiaisFifa.get("Argentina"));
		
		// remove o campeao Franca
		campeoesMundiaisFifa.remove("Franca");
		
		// retorna se existe ou nao um campeao Franca
		System.out.println(campeoesMundiaisFifa.containsKey("Franca"));

		// retorna se existe ou nao um hexacampeao
		System.out.println(campeoesMundiaisFifa.containsValue(6));
		
		// retorna o tamanho do mapa
		System.out.println(campeoesMundiaisFifa.size());
		
		System.out.println(campeoesMundiaisFifa);
		
		campeoesMundiaisFifa.forEach((var chave, var vitorias) -> {
			System.out.println(chave + "=" + vitorias);
		});
		
	}
	
}
