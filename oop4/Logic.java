package by.htp.less.oop4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {

	private Scanner scanner = new Scanner(System.in);
	
    public void printOptions() {
    	
        String menuText = "Available operations:\n" +
                "1 - View all treasures;\n" +
                "2 - Choose the most expensive treasure;\n" +
                "3 - Select treasures for a given amount;\n" +
                "4 - Close program .";
        System.out.println(menuText);
    }

    public int makeChoice() {
    	
        int choice;

        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("There is no such option. Repeat entry.\n");
                printOptions();
            } else {
                return choice;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.\n");
            printOptions();
        }
        return -1;
    }

    public boolean processingOperation(int choice) {
    	
        LogicT treasureAction = new LogicT();
        
        switch (choice){
            case 1:
                System.out.println("List of treasures in the cave:");
                treasureAction.showAllTreasure();
                break;
            case 2:
                System.out.println("The most expensive treasure:");
                treasureAction.chooseMostExpensive();
                break;
            case 3:
                int [] valueRange = new int[2];
                boolean isValid = false;
                
                while (!isValid) {
                    System.out.println("Enter the desired range of treasure value with a space.");
                    
                    Scanner scanner = new Scanner(System.in);
                    try {
                        valueRange[0] = scanner.nextInt();
                        valueRange[1] = scanner.nextInt();
                        isValid = true;
                        
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Try again.");
                    }
                }
                System.out.println(String.format("Treasures value from %d to %d:", valueRange[0], valueRange[1]));
                treasureAction.selectForGivenAmount(valueRange);
                break;
                
            case 4:
                System.out.println("it is Finish!.\nBuy-bye my Friend =)");
                return true;
        }
        return false;
    }
}
