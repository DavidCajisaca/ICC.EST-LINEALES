package Controllers;

import Views.ConsoleView;
import models.Contact;

public class MenuController {

    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView(null);
    }
    

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleView.displayMenu();
            String option = consoleView.getinput(" ");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Exiting...");
                    break;
                default:
                    consoleView.showMessage("Invalid Option");
                    break;
            }
        }
    }

    private void addContact() {
        String name = consoleView.getinput("Ingrese el nombre: ");
        String phone = consoleView.getinput("Ingrese el telefono: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto anadido");
    }

    private void findContact() {
        String name = consoleView.getinput("Ingrese el nombre a buscar: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: "+contact);
        } else {
            consoleView.showMessage("Contact not found 404");
        }
    }

    private void deleteContact() {
        String name = consoleView.getinput("Ingrese el nombre a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contacto eliminado");

    }

    private void printList() {
        contactManager.printList();
    }
}