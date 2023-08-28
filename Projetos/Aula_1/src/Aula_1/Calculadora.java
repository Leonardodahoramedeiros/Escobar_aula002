package Aula_1;

public class Calculadora {
	
	public double n1;
	public double n2;
	private double soma;
	
	
	public double somar(double n1,double n2) {
		soma = n1 + n2;
		return soma;
	}
	
	public double soma_zera(double n1, double n2) {
		zerar_n1();
		return(n1 + n2);
		
	}
	
	private void zerar_n1() {
		this.n1 = 0;
	}
	

}
