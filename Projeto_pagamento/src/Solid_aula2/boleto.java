package Solid_aula2;

public class boleto implements servico_financeiro{
	
	public String nosso_numero;
	public String data_vencimento;
	public double valor;
	public String nome;
			
		@Override
		public boolean pagar() {
			if(this.Validar()) {
				return true;
			}else {
				return false;
			}
		}

		private boolean Validar() {
			// TODO Auto-generated method stub
			return false;
		}
	}


