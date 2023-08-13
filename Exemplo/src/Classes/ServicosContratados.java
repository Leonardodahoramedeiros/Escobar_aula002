package Classes;

public class ServicosContratados {
	//id, data,cliente,servico,prestador,valor
	private int id;
	private String data;
	private Cliente cliente;
	private Servico servico;
	private Prestador prestador;
	private double valor;

	
	public ServicosContratados(int id, String data, Cliente cliente, Servico servico, Prestador prestador, double valor) {
		this.id=id;
		this.data=data;
		this.cliente=cliente;
		this.servico=servico;
		this.prestador=prestador;
		this.valor=valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


	public Prestador getPrestador() {
		return prestador;
	}


	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
