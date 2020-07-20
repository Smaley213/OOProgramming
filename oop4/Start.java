package by.htp.less.oop4;

public class Start {

	public static Cave dragon = new Cave("Dragon");

	public static void main(String[] args) {
		View consoleMenu = new View();
		dragon.setNumberOfTreasure(100);
		consoleMenu.startConsoleMenu();
	}

}
