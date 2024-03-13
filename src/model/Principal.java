package model;

public abstract class Principal {
private String nome;
private int duracao;
private String categoria;
private int tipo;
private int id;


public Principal(String nome, int duracao, String categoria, int tipo, int id) {
	
	this.nome = nome;
	this.duracao = duracao;
	this.categoria = categoria;
	this.tipo = tipo;
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getDuracao() {
	return duracao;
}
public void setDuracao(int duracao) {
	this.duracao = duracao;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public int getTipo() {
	return tipo;
}
public void setTipo(int tipo) {
	this.tipo = tipo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public void visualizar() {
	String tipo ="";
	
	switch(this.tipo) {
	case 1-> tipo = "Filme";
	case 2 -> tipo = "Serie";
	}
	System.out.println("\\n\\n***********************************************************");
	System.out.println("Dados do Item: ");
	System.out.println("***********************************************************");
	System.out.println("Nome do item: "+this.getNome());
	System.out.println("Duração do item: "+this.getDuracao());
	System.out.println("Categoria do item: "+this.getCategoria());
	System.out.println("Tipo do item: "+ tipo);
	System.out.println("Id do item: "+ this.id);
}



}
