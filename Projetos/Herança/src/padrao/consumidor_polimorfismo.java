package padrao;

public class consumidor_polimorfismo {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Professor prof = new Professor();
		a.cpf="123";
		prof.cpf="0000";
		
		
		
		Testadora t = new Testadora();
		t.processar(a);
	
		t.processar(prof);
		

	}

}
