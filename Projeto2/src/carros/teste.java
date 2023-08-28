package carros;

import java.io.FileOutputStream;
import java.io.IOException;

public class teste {

	public static void main(String[] args) {
		Carros c1 = new Carros("Gol", "Vermelho");
		Carros c2 = new Carros("208", "Cinza");
		Carros c3 = new Carros("Passat","branco");
		
		Marcas m1 = new Marcas("VW");
		Marcas m2 = new Marcas("Peugeot");
		
		m1.adicionarCarro(c1);
		m2.adicionarCarro(c2);
		m1.adicionarCarro(c3);
		
		m1.exibirLista();
		m2.exibirLista();
		
	}
}


