package carros;

import java.util.ArrayList;
import java.util.List;

public class Marcas {
	
	private String NomeMarca;
	private List<Carros> carro;
	
	public Marcas(String NomeMarca) {
		this.NomeMarca=NomeMarca;
		this.carro = new ArrayList<>();
	}
	public void adicionarCarro(Carros carros) {
		carro.add(carros);
	}
	public void exibirLista() {
		System.out.println("O nome da marca é: " + NomeMarca);
		for(Carros carros : carro) {
			System.out.println("O nome do carro é: " + carros.Nome);
			System.out.println("A cor do carro é: " + carros.Cor);
			System.out.println();
		}
	}
	

}
