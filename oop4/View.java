package by.htp.less.oop4;


public class View {

	private Logic consoleMenuAction = new Logic();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }

}
