package gravar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ler_arquivo {

	public static void main(String[] args) {
		
		String caminho = "C:\\Users\\Leonardo\\leonardolindao\\teste.txt";
		
		List<produto> list = new ArrayList<produto>();// abrir arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			linha = br.readLine();
			while(linha != null) {
				String [] vect = linha.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				
				produto prod = new produto(name, price, qte);
				System.out.println("Produtos");
				for(produto p: list) {
					System.out.println(p);
				}
			
				
				list.add(prod);
				  linha = br.readLine();			
				}	
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		

	}

}
