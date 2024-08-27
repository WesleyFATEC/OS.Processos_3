package controller;

import java.io.IOException;
import java.util.Scanner;

public class DistroController {
	private String os(){
		return System.getProperty("os.name");	
	}
	
	public void exibdistro () {
		String os = os();
		if(os.contains("ux")){
			Process process;
			try {
				process = Runtime.getRuntime().exec("cat /ect/issue");
				Scanner scanner = new Scanner(process.getInputStream());
				String linha = scanner.nextLine();
				System.out.println(linha);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("O Sistema não é linux");
		}
	}
	
}
