package importação;

import java.io.FileWriter;
import java.io.IOException;

public class cliente {
			
		public String nome;
		public String cpf;
		public String email;
		
		
		public void salvar() {
			
			try {
			String separador = ";";
			FileWriter arquivo = new FileWriter("C:\\Users\\Aluno\\Documents\\leo\\clientes.csv", true);
			String linha = this.cpf + separador + 
							this.nome+ separador +
							this.email + System.lineSeparator();
							
			arquivo.write(linha);
			arquivo.flush();
			arquivo.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
	
	
