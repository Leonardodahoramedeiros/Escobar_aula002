package Solid_aula2;

public class cartao_credito extends cartao_base {
	
	@Override
	public boolean pagar() {
		if(this.Validar()) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
