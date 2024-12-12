package adapter;

public class ChargerABX implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Charging Android phone using ABX charger");
    }
}
