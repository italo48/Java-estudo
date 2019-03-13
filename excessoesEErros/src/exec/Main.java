package exec;

import arquivos.Registrador;
import main.Arquivador;
import ui.UIInput;
import ui.UIOutput;

/*
 *	Programa que tudo o que é escrito no console é guardado em um arquivo; 
 *
 **/

public class Main {
	public static void main(String[] args) {
		
		Registrador reg = new Registrador();
		UIOutput out = new UIOutput();
		UIInput in = new UIInput();
		
		Arquivador arq = new Arquivador(reg, out, in);
		arq.exec();
	}
}
