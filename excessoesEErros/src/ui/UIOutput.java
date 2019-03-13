package ui;

public class UIOutput {	
	private void showName() {
		System.out.println("\n");
		System.out.println("+-------------------+");
		System.out.println("|    Registrador    |");
		System.out.println("+-------------------+");
		System.out.println("\n");
	}
	public void showMainMenu() {
		showName();
		System.out.println("1 - Sair");
		System.out.println("2 - Registrar");
		System.out.println("3 - Ver Registros");
	}
	public void askOption() {
		System.out.println("\n");
		System.out.print(">: ");
	}
	public void invalidOption() {
		System.out.println("Opção invalida");
	}
	public void bye() {
		System.out.println("BYE!!");
	}
	public void askReg() {
		System.out.print("Escreva: ");
	}
}
