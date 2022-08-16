package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone somePhone;
        somePhone = new DeskPhone(123456);
        somePhone.powerOn();
        somePhone.callPhone(682374);
        somePhone.answer();
    }
}
