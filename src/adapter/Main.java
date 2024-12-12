package adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

        AndroidCharger androidCharger = new ChargerABX();

        AppleCharger chargerXYZ = new AdapterCharger(androidCharger);

        Iphone16 iphone16 = new Iphone16(chargerXYZ);

        iphone16.chargeIphone();
    }
}
