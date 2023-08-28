package Alunos;

public class Alunos {
	
	public String Nome;
	public int RGM;
	
	public Alunos(String Nome, int RGM) {
		this.Nome=Nome;
		this.RGM=RGM;
	}
	  public void detalhes() {
	        System.out.println("Nome: " + Nome);
	        System.out.println("RGM: " + RGM);
	    }

}
