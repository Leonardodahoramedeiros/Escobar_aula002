package polimorfismo;

public class bacharelado_laboratorio extends curso {
	
	public double curso_lab;

	@Override
	public double GetCusto_do_Curso() {
		
		return this.valor_parcela + this.curso_lab;
	}

	@Override
	public String GetNome_do_curso() {
		// TODO Auto-generated method stub
		return this.nome_curso;
	}
	
	

}
