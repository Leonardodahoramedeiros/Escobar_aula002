package Cacl;

import java.util.Scanner;

public class Consumidor_calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite qual operação vai ser");
		char operação = sc.next().charAt(0);
		
		System.out.println("Digite o segundo valor: ");
		double num2 = sc.nextDouble();
		
		double resultado = 0.0;
		
		switch(operação) {
		
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação inexistente!");
			return;
			
		}
		
		System.out.println("O resultado do "+num1 + operação+" é "+resultado );
		
		sc.close();
		
		
		

	}

}
