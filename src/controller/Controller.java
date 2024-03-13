package controller;

import java.util.ArrayList;

import model.Principal;
import model_repository.Repository;

public class Controller implements Repository {
	private ArrayList<Principal> listaItens = new ArrayList<Principal>();
	int numero;

	@Override
	public void RegistrarItem(Principal principal) {
		listaItens.add(principal);
		System.out.println("\nItem número: "+principal.getNumero()+ "Foi Registrado com sucesso!");
	}

	@Override
	public void ListarTodosItens() {
		for(var item : listaItens) {
			item.visualizar();
		}
		
	}

	@Override
	public void BuscarItemPorId(int numero) {
		var item = buscarNaArray(numero);
		
		if(item !=null)
			item.visualizar();
		else
			System.out.println("\nO item número: "+ numero +"Não foi encontrado!");
			
		
	}

	@Override
	public void AtualizarDados(Principal principal) {
		var buscaItem = buscarNaArray(principal.getNumero());
		
		if(buscaItem != null) {
			listaItens.set(listaItens.indexOf(buscaItem), principal);
			System.out.println("\nO Item id: "+ principal.getNumero()+"Foi atualizado com sucesso!");
		}else
			System.out.println("\nO item numero: "+principal.getNumero()+"Não foi encontrado!");
		
	}

	@Override
	public void DeletarItem(int numero) {
		var item = buscarNaArray(numero);
		if(item != null) {
			if (listaItens.remove(item)== true)
				System.out.println("\nO item foi removido com sucesso!");
		}else
			System.out.println("\nO Item não foi encontrado!!");
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	public Principal buscarNaArray(int numero) {
		for(var item : listaItens) {
			if (item.getNumero()== numero) {
				return item;
			}
		}
		return null;
	}

}
