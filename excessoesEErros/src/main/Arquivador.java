package main;

import java.io.IOException;
import java.util.Scanner;

import arquivos.Registrador;
import ui.UIInput;
import ui.UIOutput;

public class Arquivador {
	private Registrador registradorArquivador;
	private UIOutput outArquivador;
	private UIInput inArquivador;
	
	private Scanner in = new Scanner(System.in);
	
	public Arquivador( Registrador registrador, UIOutput out, UIInput in ) {
		this.registradorArquivador = registrador;
		this.outArquivador = out;
		this.inArquivador = in;
	}
	public void exec() {
		boolean control = true;
		int op = 0; 
		while(control) {
			outArquivador.showMainMenu();
			
			outArquivador.askOption();
			
			op = in.nextInt();
			
			if(op == 1) {
				control = false;
				outArquivador.bye();
			}
			else if(op == 2) {
				try {
					in.nextLine();
					outArquivador.askReg();
					String reg = in.nextLine();
					registradorArquivador.gravar(reg);
				} catch (IOException e) {
					System.out.println("Erro ao gravar dados");
				}
			}
			else if(op == 3) {
				try {
					inArquivador.showRecords();
					registradorArquivador.ler();
				} catch (IOException e) {
					System.out.println("Erro ao ler dados");
				}
			}
			else {
				outArquivador.invalidOption();
			}
		}
	}
}
