package models;

public class Contanct<T,U> {
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
public Contanct(T name, U phone) {
    this.name = name;
    this.phone = phone;
}
@Override
public String toString() {
    return "Contanct [name=" + name + ", phone=" + phone + "]";
}
 

}
