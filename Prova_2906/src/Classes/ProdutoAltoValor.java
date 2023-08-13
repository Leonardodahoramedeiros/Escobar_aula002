package Classes;

public class ProdutoAltoValor extends Produto {
	

	public double valorSeguro;
	public String tipoTransporte;
	
	 public double calcularPrecoTotal() {
	    	
	        return precoSugerido + custoArmazenamento;
	    }

}
