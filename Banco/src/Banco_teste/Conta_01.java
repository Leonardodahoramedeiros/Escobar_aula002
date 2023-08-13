package Banco_teste;

public class Conta_01 {
	
	public String numero;
	public double saldo = 0;
	public String tipo;

	
	public Conta_01(String numero, double saldo, String tipo) {
		
		this.numero=numero;
		this.saldo=saldo;
		this.tipo=tipo;
	
	}
	
	public double saldo(double valor) {
		
		
		return this.saldo;
	}
}
