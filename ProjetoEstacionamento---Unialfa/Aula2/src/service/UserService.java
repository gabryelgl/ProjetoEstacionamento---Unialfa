package service;

import java.util.ArrayList;

import model.User;

public class UserService {
	public Boolean escrever(User user) {
		return true;
	}
	
	public Boolean ler(User user) {
		return true;
	}
	
	public ArrayList<User> ler() {
		ArrayList<User> listUser = new ArrayList<>();
		return listUser;
	}
	
	public Boolean excluir(User user) {
		if (existeArquivo()) {
			
		} else {
			return false;
		}
		
		return true;
	}
	
	public Boolean atualizar(User user) {
		
		if (existeArquivo()) {
			
		} else {
			return false; 
		}
		
		return true;
	}
	
	private Boolean existeArquivo() {
		return true;
	}
	
	private Boolean criarArquivo() {
		return true;
	}
}
