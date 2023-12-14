/*
 * ====== ESTRUTURA DE DADOS VETOR ======
 * I) TESTE DE INSTANCIAÇÃO DA CLASSE Vetor PELO SEU CONSTRUTOR
 * II) TESTE DE IMPLEMENTAÇÃO DO MÉTODO add DA CLASSE Vetor
 */
package com.noe.estruturadedados.application;

import com.noe.estruturadedados.entities.Vetor;

public class ProgramVetor {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);
		
		try {
			imprimirVetor(vetor);
			
			vetor.add("Noé");
			vetor.add("Noé");
			
			System.out.println();
			imprimirVetor(vetor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void imprimirVetor(Vetor vetor) {
		for (String elementosVetor : vetor.getElementos()) {
			System.out.println(elementosVetor);
		}
	}

}
