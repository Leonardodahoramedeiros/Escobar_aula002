package banco;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private String nome;
	
	Banco (String x){
		this.nome = x;	
		
	}
	
	public Cliente criar_cliente(String nome, String cpf) {
		Cliente cliente = new Cliente();
		cliente.set_nome(nome);
		cliente.set_cpf(cpf);
		
		
		clientes.add(cliente);
		
		return cliente;
	}
	
	
	public Cliente criar_cliente() {
		Cliente cliente = new Cliente();
		
		
		return cliente;
	}
	
	public void imprimir_clientes() {
		for (int i = 0; i < clientes.size(); i++) {
			clientes.get(i).imprimi();			  
			}
	}
	
	public void criar_conta(String numero, String tipo, Cliente cliente) {
		Conta conta = new Conta(numero, tipo);
		cliente.set_conta(conta);
		conta.set_cliente(cliente);
		
		
		
	}
	
	

}
