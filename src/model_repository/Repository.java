package model_repository;

import model.Principal;

public interface Repository {
public void RegistrarItem(Principal principal);
public void ListarTodosItens();
public void BuscarItemPorId(int numero);
public void AtualizarDados(Principal principal);
public void DeletarItem(int numero);

}
