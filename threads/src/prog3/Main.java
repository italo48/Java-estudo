package prog3;

public class Main {
	public static void main(String[] args) {
//		classes anonimas
		Runnable r = new Programa();
		Thread t = new Thread(r);
		t.start();
		
//		new em uma interface com um so metodo
		Runnable r2= new Runnable(	) {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println("Valor: " + i);
				}
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();		
		
//		classe anonima com lambda
		Runnable r3 = () -> {
			for(int i = 0; i < 10000; i++) {
				System.out.println("Valor: " + i);
			}
		};
		 
		Thread t3 = new Thread(r3);
		t3.start();
		
//		mais ousadia ainda
		new Thread ( () -> {
			for(int i = 0; i < 10000; i++) {
				System.out.println("Valor: " + i);
			}
		}).start();
//		estou horrorizado!!
	}
}
