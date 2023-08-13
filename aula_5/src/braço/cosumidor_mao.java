package braço;

public class cosumidor_mao {

	public static void main(String[] args) {

		mao m = new mao();
		dedo d;
		d = new dedo();
		
		m.lado="Esquerdo";
		d.posicao=5;
		m.dedos.add(d);
			
		d = new dedo();
		
		m.lado="Direito";
		d.posicao=10;
		m.dedos.add(d);
	
		for( int i = 0; i < m.dedos.size();i++) {
			System.out.println(m.dedos.get(i).posicao);
			
		}			
		
	}

}
