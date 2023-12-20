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
	
	/*
	 * RETORNA A QUANTIDADE DE POSIÇÕES OCUPADAS NO VETOR.
	 * O ATRIBUTO "posicao" É INCREMENTADO SEMPRE QUE CHAMADO O MÉTODO "add"
	 */
	public int getPosicao() {
		return posicao;
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
	
	/*
	 * IMPRIMINDO O VETOR COM O toString.
	 * 
	 * VERIFICANDO SE O PRIMEIRO ELEMENTO É null, SE NÃO, FAZ A ITERAÇÃO DOS ELEMENTOS DO VETOR
	 * QUE SÃO DIFERENTES DE null.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (this.elementos[0] != null) {
			sb.append("[");
			sb.append(this.elementos[0]);
			int i = 1;
			while(this.elementos[i] != null && i < this.elementos.length) {
				sb.append(", " + this.elementos[i]);
				i++;
			}
			sb.append("]");
		} else {
			sb.append("Nenhum elemento adicionado!");
		}
		return sb.toString();
	}
	
}
