package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.User;

public class UserService {
	
	private final String DIR_USER_DB = "src/data_base/user.txt";
	
	public Boolean escrever(User user) {
		
		try {
			
			if(existeArquivo()) {
				User user1 = new User();
				
				FileReader fileReader = new FileReader(DIR_USER_DB);
				BufferedReader readerMemory = new BufferedReader(fileReader);
				
				int lineCont = 0;
				String line = null;
				
				while ((line = readerMemory.readLine()) != null) {
					lineCont++;
				}
				
				lineCont++;
					
				String writeDates = lineCont + ";" + user1.getUsername() + ";" + user1.getPassword();
				
				File file = new File(DIR_USER_DB);
				FileWriter fileWriter = new FileWriter(file, true);
				
				fileWriter.write(writeDates);
				fileWriter.close();
				
				return true;
				
			} else {
				criarArquivo();
				escrever(user);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Não foi possível abrir o arquivo.");
			System.out.println("O erro gerado é: " +e.getMessage());
		
		} catch (IOException e) {
		
			System.out.println("Não foi possível ler o arquivo.");
			System.out.println("O erro gerado é: " +e.getMessage());
		
		}
		
		return false;
	}
	
	public Boolean ler(User user) {
		return false;
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
		File file = new File(DIR_USER_DB);
		return file.exists();
	}
	
	private Boolean criarArquivo() {
		
		try {

			File file = new File(DIR_USER_DB);			
			return file.createNewFile();
			
		} catch (IOException e) {
			
			System.out.println("Ocorreu um erro ao criar o arquivo de Usuário.");
			System.out.println("O erro gerado é: " + e.getMessage());
			return false;
		
		}
		
	}
}
