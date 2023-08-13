package importação;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class consumidor {

		public static void main(String[] args) {

			Scanner keyboard = new Scanner(System.in);

			int decision = 1;

			while (decision != 0) {
				
				System.out.println("\nChoose an option:\n0) Quit\n1) Create a file");
				decision = keyboard.nextInt();

				keyboard.nextLine();
				
				switch (decision) {

				case 1: {
					System.out.println("Enter file name:");
					String File_name = keyboard.nextLine();

					File arquivo = new File("C:\\Users\\Usuario\\Documents\\Vinicius" + File_name + ".txt");

					Boolean Add_conteudo_ao_existente = false;

					if (arquivo.exists()) {
						System.out.println("This this file already exists! Do you want to add content to it? Just type an y for YES ");
						String User_choice = keyboard.nextLine();

						if (User_choice.equalsIgnoreCase("y")) {
							Add_conteudo_ao_existente = true;
						} else {
							System.out.println("Just warning that you will overwrite the contents of the file" + File_name);
						}
					}
					try {

						FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Documents\\Vinicius\\" + File_name + ".txt",Add_conteudo_ao_existente);

						System.out.println("Type something to be writed to the file: ");
						String text = keyboard.nextLine();

						arq.write(text + "\n");
						System.out.println("successfully saved file!!");

						arq.flush();
						arq.close();
					} catch (IOException e) {
						e.printStackTrace();

					}
				}
					break;
				}

			}
		}
	}


