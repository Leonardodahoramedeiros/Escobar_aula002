package FC;

public class Estudante {
	
	public String cpf;
    public String nome;
    
    public String getNome() {
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome=nome;
    }
    public String getCpf() {
    	return cpf;
    }
    public void setCpf(String cpf) {
    	this.cpf=cpf;
    }
    
    
    public Estudante(String cpf, String nome) {
    	this.cpf=cpf;
    	this.nome=nome;
    }
    
    

}
