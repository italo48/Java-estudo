package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Registrador {
	private String path = "arq.txt";
	
	public void gravar(String registro) throws IOException{
		 BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		 buffWrite.append(registro + "\n");
		 buffWrite.close();
	}
	public String ler() throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String arq = "";
		while(true) {
			if(arq != null) {				
				System.out.println(arq);
			}else {
				break;
			}
			arq = buffRead.readLine();
		}
		buffRead.close();
		return arq;
	}
}
