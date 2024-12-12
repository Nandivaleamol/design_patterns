package adapter;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Charging iPhone using ChargerXYZ");
    }
}
