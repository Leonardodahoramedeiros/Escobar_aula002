package Polimorfismo;

public class consumidor_polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pedagio p = new pedagio();
		
		carro_passeio carro = new carro_passeio();
		carro.eixos= 2;
		caminhao c = new caminhao();
		c.eixos=6;
		System.out.println(p.cobrar(carro));
		System.out.println(p.cobrar(c));

	}

}
