package polimorfismo;

public abstract class curso implements intercurso {
	//classes abstratas não podem ser utilizadas para construir objeto
	
	//somete podem servir par
	String nome_curso;
	int carga_horaria;
	double valor_parcela;
	
	public void salvar() {
		System.out.println("Salvando");
		
	}
	
	public void delete() {
		System.out.println("Excluindo");
	}
	
	public void find_one() {
		System.out.println("Localizando");
	}

}
