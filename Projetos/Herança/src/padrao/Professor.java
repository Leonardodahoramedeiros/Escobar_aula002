package padrao;

public class Professor extends Pessoa{
	
	public String tipo_contrato;
	
	
	@Override
	public boolean Salvar() {
		super.Salvar();
		System.out.println("Comportamento especializado do professor");

		return true;
		
	}

}
