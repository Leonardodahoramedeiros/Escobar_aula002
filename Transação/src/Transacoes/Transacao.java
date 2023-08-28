package Transacoes;

public class Transacao implements Base {
	
	public double valorBruto;
	
	public Transacao(double valorBruto) {
		this.valorBruto=valorBruto;
	}
	
	 
	@Override
	public boolean CalcularValorLiquido() {
		// TODO Auto-generated method stub
		return false;
	}

}
