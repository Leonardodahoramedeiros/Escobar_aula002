package Polimorfismo;

public class carro_passeio implements Veiculo{
	
	public String combustivel;
	public double eixos;
	@Override
	public double getEixos() {
		
		return this.eixos/2;
	}

}
