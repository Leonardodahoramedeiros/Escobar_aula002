package ler;

import java.io.FileWriter;
import java.io.IOException;

public class cliente {
	
	public String nome;
	public String cpf;
	public String email;
	public String numero;
	
	
	
	public void save() {
		try {
			String separete = ";";
			FileWriter file = new FileWriter("C:\\Users\\Leonardo\\leonardolindao\\clientes.txt", true);
			String linha = this.nome + this.cpf + this.email + this.email + System.lineSeparator();
			
			file.write(linha);
			file.flush();
			file.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
