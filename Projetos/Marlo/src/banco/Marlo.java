package banco;

public class Marlo {

	public static void main(String[] args) {
		Banco banco = new Banco("HSBC");
		
		Cliente cli1 = banco.criar_cliente("marlo", "123");
	
		
		
		banco.criar_conta("000","corrente", cli1);
		
		
		
		Cliente cli2 = banco.criar_cliente("leo", "555");
		
		banco.criar_conta("111", "corrente", cli2);
		
		
		banco.imprimir_clientes();


	}

}
