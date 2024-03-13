package model;

public class Estendida extends Principal {
	private int temporadas;
	private int numero;

	public Estendida(int numero,String nome, int duracao, String categoria, int tipo,int temporadas) {
		super(numero,nome, duracao, categoria, tipo);
		this.temporadas = temporadas;
		this.numero= numero;
	
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Temporadas: "+ this.temporadas);
	}
	

}
