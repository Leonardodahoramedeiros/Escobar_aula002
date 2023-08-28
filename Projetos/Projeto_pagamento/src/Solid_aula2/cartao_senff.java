package Solid_aula2;

public class cartao_senff extends cartao_base{
	
	
	
	protected boolean ValidadaData() {
			
		return true;
		
	}

	@Override
	public boolean pagar() {
		if(this.Validar()) {
			return true;
		}else {
			return false;
		}
	}


}
