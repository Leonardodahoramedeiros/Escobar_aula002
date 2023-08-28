package FC;

public class Estudante_graduacao extends Estudante {
	
	public Estudante_graduacao(String cpf, String nome) {
		super(cpf, nome);
	
	}

	public double nota;
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota=nota;
	}
	
	
}
