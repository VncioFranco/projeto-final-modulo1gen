package model;

public class Estendida extends Principal {
	private int temporadas;

	public Estendida(String nome, int duracao, String categoria, int tipo, int id ,int temporadas) {
		super(nome, duracao, categoria, tipo, id);
		this.temporadas = temporadas;
	
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Temporadas: "+ this.temporadas);
	}
	

}
