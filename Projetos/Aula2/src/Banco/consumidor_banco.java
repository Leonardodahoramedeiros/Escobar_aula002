package Banco;

public class consumidor_banco {

	public static void main(String[] args) {
		
		Conta banco = new Conta();
		banco.banco = "Bradesco";
		banco.agencia = "111";
		banco.conta = "888";
		
		banco.depositar(100);
		
		System.out.println(banco.consulta_saldo());
		banco.sacar(50);
		System.out.println(banco.consulta_saldo());

	}

}
