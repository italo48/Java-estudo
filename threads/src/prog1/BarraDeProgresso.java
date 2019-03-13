package prog1;

public class BarraDeProgresso extends Thread{
	public void run() {
		System.out.println("Atualizando a barra de progresso...");
		int i = 0;
		while(i < 10) {
			i++;
		}
		System.out.println(i);
	}
}
