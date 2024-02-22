package Classes;

public class Carro extends Veiculo{
	
	private int nPortas;

	public Carro(String mnodelo, String marca, int anoFabricacao, double preco) {
		super(mnodelo, marca, anoFabricacao, preco);
		// TODO Auto-generated constructor stub
	}
	
	  public int getNumeroPortas() {
	        return nPortas;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "," + nPortas;
	    }

	
}
