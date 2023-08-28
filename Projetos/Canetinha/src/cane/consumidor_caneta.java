package cane;

public class consumidor_caneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo="Bic Cristal";
		c1.cor="Azul";
		c1.ponta=0.5f;
		c1.status();
		
		System.out.println("----------");
		
		Caneta c2 = new Caneta();
		c2.cor="Vermelha";
		c2.ponta=1.0f;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
