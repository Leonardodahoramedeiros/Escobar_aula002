package padrao;

public  abstract class Pessoa {
	

		public String matricula;
		public String cpf;
		public String nome;
		public String email;
		public int idade;
		
		
		public boolean findOne() {
			System.out.println("Find one da super classe");
			return true;
		}
		public boolean Salvar () {
			System.out.println("Salvar da super classe: " + this.cpf);
			return true;	
		}
		public boolean delete() {
			System.out.println("Delete da super classe"); 
			return true;
		}


}
