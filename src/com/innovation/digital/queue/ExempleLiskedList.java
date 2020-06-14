package com.innovation.digital.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExempleLiskedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		
		filaBanco.add("Pamela");
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco); // exibe os elementos da fila
		
		var clienteASerAtendido = filaBanco.poll(); // captura o primeiro elemento da fila
		
		System.out.println("Primeiro cliente: " + clienteASerAtendido); // exibe o primeiro elemento da fila
		
		System.out.println(filaBanco); // exibe a fila sem o primeiro elemento
		
		var primeiroCliente = filaBanco.peek(); // captura o primeiro elemento da fila sem remove-lo da fila
		
		System.out.println("Primeiro cliente: " + primeiroCliente); 
		
		System.out.println(filaBanco); // exibe os elementos da fila 
		
		// filaBanco.clear();
		
		var primeiroClienteOuErro = filaBanco.element();
		
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		filaBanco.forEach(client -> {
			System.out.println(client);
		});
		
	}
	
}