package Classes;

public class Veiculo {

	    private String modelo;
	    private String marca;
	    private int AnoFabricado;
	    private double preco;

	    public Veiculo(String mnodelo, String marca, int anoFabricacao, double preco) {
	        this.modelo = modelo;
	        this.marca = marca;
	        this.AnoFabricado = anoFabricacao;
	        this.preco = preco;
	    }

	    public String getModelo() {
	        return marca;
	    }

	    public String getMarca() {
	        return modelo;
	    }

	    public int getAnoFabricacao() {
	        return AnoFabricado;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    @Override
	    public String toString() {
	        return modelo + "," + marca + "," + AnoFabricado + "," + preco;
	    }
	}


