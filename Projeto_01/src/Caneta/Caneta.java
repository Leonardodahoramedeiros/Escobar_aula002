package Caneta;

public class Caneta {
	
	String cor;
	String modelo;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Está caneta está tampada: " + this.tampada);
	}

	void  rabiscar(){
		if(this.tampada == true) {
			System.out.println("Não posso rabiscar!");
			
		}else{
			System.out.println("Posso rabiscar");
		}
		
		
	}
	void tampar() {
		this.tampada = true;
		
	}
	
	void destampar() {
		this.tampada=false;
	}
	

}
