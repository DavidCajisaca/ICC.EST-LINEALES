package Views;

import java.util.Scanner;

public class ConsoleView {
 private Scanner scanner;
 public ConsoleView(Scanner scanner) {
    this.scanner = new Scanner(System.in);
 
 }
 public void displayMenu(){
    System.out.println("======= Contact Manager Menu =====");
    System.out.println("1. Add a contact");
    System.out.println("2. Find contact");
    System.out.println("3. Delete contact");
    System.out.println("4. Print contact");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");

 }
    public String getinput(String promt){
        System.out.print(" * "+promt);
        return scanner.nextLine();
    }
    public void showMessage(String message){
        System.out.println("------"+message);
    }
}
