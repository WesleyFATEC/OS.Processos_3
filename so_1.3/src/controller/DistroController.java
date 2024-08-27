package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DistroController {
	private String os(){
		return System.getProperty("os.name");	
	}
	
	public void exibdistro () {
		String os = os();
		if(!os.contains("dows")){
			Process process;
			try {
				process = Runtime.getRuntime().exec("cat /etc/issue");
				 try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
	                    // Lê a primeira linha da saída
	                    String linha = reader.readLine();
	                    if (linha != null) {
	                        System.out.println(linha);
	                    }
	                }
	                process.waitFor();
	                
				
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("O Sistema não é linux");
		}
	}
	
}
