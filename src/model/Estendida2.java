package model;

public class Estendida2 extends Principal {
String diretor;
private int numero;

	public Estendida2(int numero,String nome, int duracao, String categoria, int tipo,String diretor) {
		super(numero,nome, duracao, categoria, tipo);
		
		this.diretor = diretor;
		this.numero = numero;
		
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Diretor: " + this.diretor);

}
}
