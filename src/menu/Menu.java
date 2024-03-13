package menu;

import java.util.Scanner;

import controller.Controller;
import model.Estendida;
import model.Estendida2;

public class Menu {

	public static void main(String[] args) {
		Controller item = new Controller();
		Scanner leia = new Scanner(System.in);
		int opcao, duracao, tipo, numero, temporadas;
		String nome, diretor, categoria;
		
		System.out.println("\nItens \n");
		
		Estendida s1 = new Estendida(item.gerarNumero(),"Lost",50,"Suspense",2,15);
		item.RegistrarItem(s1);
		Estendida s2 = new Estendida(item.gerarNumero(),"Greys Anatomy",50,"Drama",2,300);
		item.RegistrarItem(s2);
		Estendida2 f1 = new Estendida2(item.gerarNumero(),"Batman",140,"Ação",1,"Cristopher nolan");
		item.RegistrarItem(f1);
		Estendida2 f2 = new Estendida2(item.gerarNumero(),"Vingadores",140,"Ação",1,"Joss Whedon");
		item.RegistrarItem(f2);
		
		

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               NetDoFlix                               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Registrar Item no Sistema                          ");
			System.out.println("            2 - Listar todas os Itens               ");
			System.out.println("            3 - Buscar Item por ID              ");
			System.out.println("            4 - Atualizar Dados do Item             ");
			System.out.println("            5 - Deletar item                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nNetDoFlix Seus Filmes e Series Favoritos em um só lugar");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1 -> {
				System.out.println("Registrar Item no Sistema\n\n");
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite a duração em minutos: ");
				duracao = leia.nextInt();
				System.out.println("Digite a Categoria: ");
				leia.skip("\\R?");
				categoria = leia.nextLine();

				do {
					System.out.println("Digite o tipo do item(1-Filme)(2-Serie): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o diretor do filme: ");
					leia.skip("\\R?");
					diretor = leia.nextLine();
					item.RegistrarItem(new Estendida2(item.gerarNumero(), nome, duracao, categoria, tipo, diretor));
				}

				case 2 -> {
					System.out.println("Digite quantas Temporadas tem: ");
					temporadas = leia.nextInt();
					item.RegistrarItem(new Estendida(item.gerarNumero(), nome, duracao, categoria, tipo, temporadas));
				}
				}
			}
			case 2 -> {
				System.out.println("Listar todas os Itens\n\n ");
				item.ListarTodosItens();
			}

			case 3 -> {
				System.out.println("Buscar item por ID\n\n");
				System.out.println("Digite o id do item: ");
				numero = leia.nextInt();
				item.BuscarItemPorId(numero);
			}

			case 4 -> {
				System.out.println("Atualizar dados do Item\n\n");
				System.out.println("Digite o id do item: ");
				numero = leia.nextInt();

				var buscaItem = item.buscarNaArray(numero);

				if (buscaItem != null) {
					tipo = buscaItem.getTipo();
					System.out.println("Digite o nome: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a duração em minutos: ");
					duracao = leia.nextInt();
					System.out.println("Digite a Categoria: ");
					leia.skip("\\R?");
					categoria = leia.nextLine();

					do {
						System.out.println("Digite o tipo do item(1-Filme)(2-Serie): ");
						tipo = leia.nextInt();
					} while (tipo < 1 && tipo > 2);
					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o diretor do filme: ");
						leia.skip("\\R?");
						diretor = leia.nextLine();
						item.AtualizarDados(
								new Estendida2(item.gerarNumero(), nome, duracao, categoria, tipo, diretor));
					}

					case 2 -> {
						System.out.println("Digite quantas Temporadas tem: ");
						temporadas = leia.nextInt();
						item.AtualizarDados(
								new Estendida(item.gerarNumero(), nome, duracao, categoria, tipo, temporadas));
					}
					}
				}
			}

			case 5 -> {System.out.println("Apagar Item\\n\\n");
			System.out.println("Digite o Id do Item: ");
			numero = leia.nextInt();
			item.DeletarItem(numero);
			}
						
			default -> System.out.println("\nOpção invalida\n");
			}
		}

	}

}
