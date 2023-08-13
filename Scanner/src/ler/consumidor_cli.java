package ler;

import java.util.Scanner;

public class consumidor_cli {

	public static void main(String[] args) {
		
		String op = "";
		Scanner teclado = new Scanner(System.in);
		cliente cli = new cliente();
		
		while(!op.equals("0")) {
			
			
			System.out.println("Digite suas informações");
			System.out.println("Digite seu nome");
			cli.nome = teclado.nextLine();
			
			System.out.println("Digite suas informações");
			System.out.println("Digite seu cpf");
			cli.cpf = teclado.nextLine();

			System.out.println("Digite suas informações");
			System.out.println("Digite seu email");
			cli.email = teclado.nextLine();

			System.out.println("Digite suas informações");
			System.out.println("Digite seu numero");
			cli.numero = teclado.nextLine();
			
			
			System.out.println("Você quer continuar? (Digite 0 para sim)");
			op = teclado.nextLine();
			
			

		}
		
		
		

	}

}
