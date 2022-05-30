package controller;

import java.util.ArrayList;

import model.User;
import service.UserService;

public class UserController {
	public String register(User user) {
		UserService userService = new UserService();
		
		if (userService.ler(user)) {
			return "Usuário já cadastrado!";
		} else {
			if(userService.escrever(user)) {
				return "Usuário cadastrado com sucesso";
			} else {
				return "Tente novamente!";
			}
		}
			
	}
	
	public ArrayList<User> toDisplay() {
		UserService userService = new UserService();
		return userService.ler();
		
	}
	
	public Boolean update(User user) {
		UserService userService = new UserService();
		
		return userService.atualizar(user);
	}
	
	public Boolean delete(User user) {
		UserService userService = new UserService();
		userService.excluir(user);
		
		return userService.excluir(user);
	}
	
}
