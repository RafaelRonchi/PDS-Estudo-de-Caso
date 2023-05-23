package modelo;

public class Usuario extends Funcionario{

	/**
	 * 
	 */
	private Boolean meiaEntrada;
	private Double precoIngresso;

	public Boolean getMeiaEntrada() {
		return meiaEntrada;
	}

	public void setMeiaEntrada(Boolean meiaEntrada) {
		this.meiaEntrada = meiaEntrada;
	}

	public Double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(Double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	
}
