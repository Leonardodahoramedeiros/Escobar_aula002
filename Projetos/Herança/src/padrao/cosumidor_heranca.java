package padrao;

public class cosumidor_heranca {

	public static void main(String[] args) {
		
		
		Aluno a = new Aluno();
		//Professor p =new Professor();
		
		a.cpf="888";
		a.nome="Pedro de Lara";
		a.idade = 24;
		a.situacao_matricula ="Ativa";
		a.Salvar();
		
//		p.cpf="999";
//		p.nome="Leonardo o belo";
//		p.matricula="010203";
//		p.Salvar();		
//		
		//criar um objeto
		// não consigo instanciar porque a classe Pessoa está abstract
//		Pessoa pessoa = new Pessoa();
//		pessoa.cpf="555";
//		pessoa.nome="Manoel";
//		pessoa.Salvar();
//		
	}

}
