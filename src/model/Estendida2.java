package model;

public class Estendida2 extends Principal {
String diretor;

	public Estendida2(String nome, int duracao, String categoria, int tipo, int id, String diretor) {
		super(nome, duracao, categoria, tipo, id);
		
		this.diretor = diretor;
		
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
