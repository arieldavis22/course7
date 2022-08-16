package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone somePhone;
        somePhone = new DeskPhone(123456);
        somePhone.powerOn();
        somePhone.callPhone(123456);
        somePhone.answer();

        somePhone = new MobilePhone(1238907);
//        somePhone.powerOn();
        somePhone.callPhone(1238907);
        somePhone.answer();
    }
}
