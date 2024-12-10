package abstractfactory.os.win;

import abstractfactory.ui.component.Button;

// Concrete Product class for Windows Button
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Windows Button");
    }
}
