package Aula_1;

public class consumidor_calculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Calculadora c = new Calculadora();
		calc.n1 =10;
		calc.n2 =10;
		System.out.println(calc.somar(calc.n1, calc.n2));
		System.out.println(calc.soma_zera(10,10));
		System.out.println(c);
	}

}
