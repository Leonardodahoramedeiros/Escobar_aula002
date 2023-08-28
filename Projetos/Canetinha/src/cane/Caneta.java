package cane;

public class Caneta {
	public String modelo;
	public String cor;
	private Float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tamapda " + this .tampada);
		System.out.println("Ponta" + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada " + this.tampada);
	}
	
	 public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar!");
		}else {
			System.out.println("Estou rabiscando!");
		}
		
	}
	protected void tampar() {
		this.tampada=true;
		
	}
	protected void destampar() {
		this.tampada=false;
		
	}
	

}
