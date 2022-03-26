package view;

import java.util.Scanner;
import model.Usuario;

public class LoginView {

	public void login() {
		Scanner Scan = new Scanner (System.in);
				
		Usuario user = new Usuario();

		System.out.println("***LOGIN***");
		System.out.println("Informe o usuáio:");
		user.setUsername(Scan.next());
		System.out.println("Informe a senha:");
		user.setPassword(Scan.next());
		System.out.println("Logado com sucesso!");
		System.out.println("");
		
		MenuView menuView = new MenuView();
		menuView.menuView();
		
	}
}