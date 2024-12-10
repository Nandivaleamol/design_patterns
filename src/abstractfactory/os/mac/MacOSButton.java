package abstractfactory.os.mac;

import abstractfactory.ui.component.Button;

// Concrete product for MacOS
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOS Button");
    }
}
