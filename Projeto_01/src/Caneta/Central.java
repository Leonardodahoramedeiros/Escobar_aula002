package Caneta;

public class Central {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor="Verde";
		c1.ponta=0.5f;
		c1.tampar();;
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor="amalero";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}

}
