package modelo;

import Interfaces.ISala;

public class Sala {
	private String Nome;
	
	public Sala(String nome) {
		// TODO Auto-generated constructor stub
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	
}
