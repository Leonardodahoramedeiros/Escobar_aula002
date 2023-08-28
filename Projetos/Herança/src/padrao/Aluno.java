package padrao;

public class Aluno extends Pessoa{
	public String situacao_matricula;
	
	@Override
	public boolean Salvar() {
		//aproveitar o conportamento do salvar da super classe 
		super.Salvar();
		System.out.println("Salvar aluno na base de dados");
		return true;
	}
	
	
	
	
	

}
