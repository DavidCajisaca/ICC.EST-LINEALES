package Controllers;

import models.Contanct;
import models.LinkedList;

public class ContactManager {
private LinkedList<Contanct<?,?>> contacts;

public ContactManager(LinkedList<Contanct<?, ?>> contacts) {
    this.contacts = contacts;
}
 public void addContact(Contanct<?,?> contact) {
    contacts.appendToTail(contact);
 } 
 public Contanct<?,?> findContanctByName(String name) {
    for (Contanct<?,?> contact : contacts) {
        if (contact.getName().equals(name)) {
            return contact;
        }
    }
    return null;
}
}