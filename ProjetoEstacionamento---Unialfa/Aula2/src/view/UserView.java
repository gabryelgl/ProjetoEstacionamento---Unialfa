package view;

import java.util.Scanner;
import model.User;
import controller.UserController;

public class UserView {
	
	public void userView(User user) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("***MENU USU�RIO***");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Deletar");
		System.out.println("9 - Voltar para o menu");
		int option = scan.nextInt();
		System.out.println("");
		
		switch(option) {
		case 1:
			register();
			break;
			
		case 2:
			toDisplay();
			break;
			
		case 9:
			MenuView menuView = new MenuView();
			menuView.menuView();
			break;
			
		}
		
		scan.close();
	}
	
	public void register() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		
		System.out.println("Informe o username:");
		user.setUsername(scan.next());
		System.out.println("Informe a senha:");
		user.setPassword(scan.next());
		System.out.println("Cadastro realizado!");
		System.out.println("");
		
		userView(user);
		
		UserController userControl = new UserController();
		userControl.register(user);
		
		scan.close();
	}
	
	public String toDisplay() {
			UserController userControl = new UserController();
			
			// retorna quando não possui usuário cadastrado
			System.out.println("Não possui usuário cadastrado!");
			
			// retorna as informações do usuário se possui registro
			return "Possui cadastro";
			
	}
	
	public void update() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		UserController userControl = new UserController();
		
		System.out.println("*** ATUALIZAÇÃO DE USUÁRIO ***");
		System.out.println("Informe o username:");
		user.setUsername(scan.next());
		System.out.println("Informe a senha:");
		user.setPassword(scan.next());
		System.out.println("");
		
		if (!userControl.update(user)) {
			System.out.println("Usuário não encontrado!");
		} else {
			System.out.println("Cadastro do usuário atualizado com sucesso!");
		}
		
	}
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		UserController userControl = new UserController();
		
		System.out.println("*** ATUALIZAÇÃO DE USUÁRIO ***");
		System.out.println("Informe o username:");
		user.setUsername(scan.next());
		System.out.println("Informe a senha:");
		user.setPassword(scan.next());
		System.out.println("");
		
		if (!userControl.delete(user) == false) {
			System.out.println("Usuário não encontrado!");
		} else {
			System.out.println("Usuário excluído com sucesso!");
		}
	}


}
