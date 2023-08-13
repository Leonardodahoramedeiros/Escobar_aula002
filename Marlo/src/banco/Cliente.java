package banco;

public class Cliente {

	
	private String nome;
	private String cpf;
	private Conta conta;
	
	
	public void imprimi() {
		System.out.println(nome + " " + cpf + " ");
		conta.imprimir();
	}
	
	Cliente (){
		
	}
	
	public void set_nome(String nome) {
		this.nome=nome;
	}
	
	public void set_cpf(String cpf) {
		
		this.cpf=cpf;
	}
		
	
	public void set_conta(Conta conta){
		this.conta=conta;
		
	}

}
