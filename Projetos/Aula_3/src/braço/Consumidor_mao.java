package braço;

public class Consumidor_mao {

	public static void main(String[] args) {
		
		
		mao m = new mao();
		dedo d;
		d = new dedo();
		d.posicao=1;
		m.lado="Direita";
		m.dedos.add(d);
		
		d = new dedo();
		d.posicao=2;
		m.dedos.add(d);
		
		d = new dedo();
		d.posicao=3;
		m.dedos.add(d);
		
		for(int i = 0; i < m.dedos.size();i++) {
			System.out.println(m.dedos.get(i).posicao);
		}	
		

	}

}
