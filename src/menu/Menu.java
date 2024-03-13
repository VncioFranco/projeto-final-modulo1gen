package menu;

import java.util.Scanner;




public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		

		while(true) {
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
			
			if(opcao== 6) {
				System.out.println("\nNetDoFlix Seus Filmes e Series Favoritos em um só lugar");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1 -> System.out.println("Registrar Item no Sistema\n\n");
			case 2 -> System.out.println("Listar todas os Itens\n\n ");
			case 3 -> System.out.println("Buscar item por ID\n\n");
			case 4 -> System.out.println("Atualizar dados do Item\n\n");
			case 5 -> System.out.println("Apagar Item\\n\\n");
			default -> System.out.println("\nOpção invalida\n");
			}
		}

	}

}
