package gravação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class doc {

	public static void main(String[] args) {
		
		String arquivo = "C:\\Users\\Leonardo\\leonardolindao\\cliente.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try{
		
			fr = new FileReader(arquivo);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();	
			}		
		}catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		finally {
			try {
				br.close();
				fr.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
			
		
	
