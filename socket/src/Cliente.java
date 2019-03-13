package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = new Socket("localhost", 12345);
		System.out.println("O cliente conectou-se ao servidor!!");
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while(teclado.hasNextLine()) {
			System.out.print("Digite algo: ");
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
	}
}
