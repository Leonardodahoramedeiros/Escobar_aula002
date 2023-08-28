package Faculdade;

public class Estudante_base {
	
	private String nome;
	private String cpf;
	
	public Estudante_base(String nome, String cpf) {
		this.nome=nome;
		this.cpf=cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome=nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf() {
		this.cpf=cpf;
	}
}
