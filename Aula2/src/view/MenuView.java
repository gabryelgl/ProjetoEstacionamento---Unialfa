package view;

import java.util.Scanner;

public class MenuView {
	public void menuView() {
		
		Scanner Scan = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("***MENU***");
		System.out.println("1 - Cadastrar usuário");
		System.out.println("2 - Cadastrar tipo do veículo");
		System.out.println("3 - Cadastrar veículo");
		System.out.println("4 - Cadastrar pessoa");
		System.out.println("5 - Cadastrar tipo de estacionamento");
		System.out.println("9 - Sair");
		opcao = Scan.nextInt();
		System.out.println("");
		
		switch(opcao) {
		case 1:
			UserView userView = new UserView();
			userView.userView(null);
			break;
			
		case 9:
			System.out.println("Você saiu do sistena!");
			System.exit(0);
		}
		
		
		
		
		Scan.close();
	}

}
