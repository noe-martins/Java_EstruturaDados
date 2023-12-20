/*
 * ====== ESTRUTURA DE DADOS VETOR ======
 * I) TESTE DE INSTANCIAÇÃO DA CLASSE Vetor PELO SEU CONSTRUTOR
 * II) TESTE DE IMPLEMENTAÇÃO DO MÉTODO add DA CLASSE Vetor
 */
package com.noe.estruturadedados.application;

import com.noe.estruturadedados.entities.Vetor;

public class ProgramVetor {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		try {
			System.out.println(vetor);
			
			vetor.add("Noé");
			vetor.add("Noé");
			vetor.add("Maria");
			
			System.out.println("\nQuantidade de posições ocupadas do vetor: " + vetor.getPosicao());
			System.out.println();
			//IMPRESSÃO SOMENTE DOS ELEMENTOS OCUPADOS DO VETOR
			System.out.println(vetor);
			//IMPRESSÃO DE TODOS OS ELEMENTOS DO VETOR
			System.out.println();
			imprimirVetor(vetor);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void imprimirVetor(Vetor vetor) {
		System.out.print(vetor.getElementos()[0]);
		for (int i = 1; i < vetor.getElementos().length; i++) {
			System.out.print(", " + vetor.getElementos()[i]);
		}
	}

}
