package models;

public class Contact<T,U> {
 private T name;
 private U phone;
public T getName() {
    return name;
}
public void setName(T name) {
    this.name = name;
}
public U getPhone() {
    return phone;
}
public void setPhone(U phone) {
    this.phone = phone;
}
public Contact(T name, U phone) {
    this.name = name;
    this.phone = phone;
}
@Override
public String toString() {
    return "Contanct [nombre=" + name + ", telefono=" + phone + "]";
}
 

}