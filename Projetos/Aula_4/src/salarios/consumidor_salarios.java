package salarios;

import java.util.ArrayList;

public class consumidor_salarios {

	public static void main(String[] args) {
		
		ArrayList<Float> salarios = new ArrayList<Float>();
		
		
		salarios.add((float)7000);
		salarios.add((float)5000);
		salarios.add((float)6500);
		
		for(int i = 0; i < salarios.size();i++) {
			System.out.println(salarios.get(i));
		}
	}

}
