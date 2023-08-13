package polimorfismo;

public class bacharelado extends curso {

	@Override
	public double GetCusto_do_Curso() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String GetNome_do_curso() {
		// TODO Auto-generated method stub
		return this.nome_curso;
	}
	
	public double getValorCurso() {
		return this.valor_parcela;
	}
	
	// extends copia tudo que tem em cursos toda a estrutura para dentro da classe bacharelado 
	// herança para baixo 
	
	

	
	

}
