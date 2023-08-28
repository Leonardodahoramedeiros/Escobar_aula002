package teste;

public class Conta {
	
	public String numero;
	//public int tipo;
	public double saldo = 0;
	
	
	public double depositar(double quantia) {
		
		this.saldo+=quantia;
		
		return saldo;
	}
	
	public void extrato(double saldo) {
		
	}
	
	public boolean sacar(double quantia) {
		if(quantia >= saldo) {
			
			return true;
		}else {
			
			return false;
		}
	}
	

}
