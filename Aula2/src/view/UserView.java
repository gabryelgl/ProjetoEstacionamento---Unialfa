package view;

import java.util.Scanner;
import model.Usuario;

public class UserView {
	Scanner Scan = new Scanner(System.in);
	
	public void userView(Usuario user) {
		
		int option;
		
		System.out.println("***MENU USUÁRIO***");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Deletar");
		System.out.println("9 - Voltar para o menu");
		option = Scan.nextInt();
		System.out.println("");
		
		switch(option) {
		case 1:
			register();
			break;
			
		case 2:
			toDisplay(user);
			break;
			
		case 9:
			MenuView menuView = new MenuView();
			menuView.menuView();
			break;
			
		}
		
	}
	
	public void register() {
		Usuario user = new Usuario();
		
		System.out.println("Informe o username:");
		user.setUsername(Scan.next());
		System.out.println("Informe a senha:");
		user.setPassword(Scan.next());
		System.out.println("Cadastro realizado!");
		System.out.println("");
		
		userView(user);
		
	}
	
	public void toDisplay(Usuario user) {

		String option = null;

			System.out.println("***LISTA DE USUARIO***");
			System.out.println("Username: "+ user.getUsername());
			System.out.println("Password: "+ user.getPassword());
			System.out.println("Insira qualquer valor para voltar ao menu:");
			option = Scan.next();
			
			if(option != null) {
				userView(user);
			}
			
			System.out.println("");
		
	}


}
