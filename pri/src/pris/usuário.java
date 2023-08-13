package pris;

public class usuário {
	
	public String nome;
	public String cpf;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public usuário(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

}
