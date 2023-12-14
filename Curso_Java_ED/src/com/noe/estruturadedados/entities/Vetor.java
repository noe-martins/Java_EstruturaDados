/*
 * CRIAÇÃO DO VETOR
 * CIRAÇÃO DA CLASSE PARA ADICIONAR ELEMENTOS NO VETOR
 */
package com.noe.estruturadedados.entities;

public class Vetor {
	private String[] elementos;
	private int posicao;
	
	/*
	 * O CONSTRUTOR INSTANCIA OS ELEMENTOS DO VETOR DANDO NO PARÂMETROO TAMANHO DELE.
	 */
	public Vetor(int tamanho) {
		this.elementos = new String[tamanho];
		this.posicao = 0;
	}
	
	
	public String[] getElementos() {
		return elementos;
	}
	
	/*
	 * ADICIONA ELEMENTOS NO VETOR INCREMENTANDO O ATRIBUTO "posicao"
	 */
	public void add(String elemento) throws Exception {
		if (this.posicao < this.elementos.length) {
			this.elementos[this.posicao] = elemento;
			this.posicao++;
		} else {
			throw new Exception("Esgotado o tamanho do vetor!");
		}

	}
}
