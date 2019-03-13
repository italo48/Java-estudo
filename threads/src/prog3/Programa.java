package prog3;

public class Programa implements Runnable {
	private int idProg;
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("Programa id: " + idProg + " Valor: " + i);
		}
	}
	public void setId(int id) {
		this.idProg = id;
	}
	public long getId() {
		return this.idProg;
	}
}
