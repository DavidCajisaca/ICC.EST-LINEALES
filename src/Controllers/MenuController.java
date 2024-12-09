package Controllers;

import Views.ConsoleView;
import models.Contanct;

public class MenuController {
private ContactManager contactManager;
private ConsoleView consoleView;

public MenuController() {
   
}
public void ShowMenu(){
    boolean exit = false;
    while (!exit) {
        consoleView.displayMenu();
        String option=consoleView.getinput("");
        switch (option) {
            case "1":
            addContact();
            break;
            case "2":
            listContact();
            break;
            case "3":
            editContact();
            break;
            case "4":

            deleteContact();
            break;
            case "5":
            
            exit = true;
            consoleView.showMessage("Saliendo");
            default:
            consoleView.showMessage("Opcion incorrecta");
            break;
        }
    }
}
private void addContact(){
    String name = consoleView.getinput("Ingrese nombre: ");
    String phoneNumber = consoleView.getinput("Ingrese numero de telefono: ");
    Contanct<String,String>contact = new Contanct<>(name,phoneNumber);
    contactManager.addContact(contact);
    consoleView.showMessage("Contacto agregado correctamente");

}

private void listContact(){
    
    
    }

private void editContact(){

}

private void deleteContact(){

}


}
