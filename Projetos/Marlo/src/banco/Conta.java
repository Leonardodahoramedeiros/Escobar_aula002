package banco;

public class Conta {
	
	private String numero;
	private String tipo;
	private Cliente cliente;
	
	
	Conta(String numero, String tipo){
		
		this.numero=numero;
		this.tipo=tipo;
	}
	
	public void set_cliente(Cliente cliente) {
		this.cliente=cliente;
		
	}
	
	public void imprimir() {
		System.out.println(numero + " " + tipo);
		
	}
	
	
}
