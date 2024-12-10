package abstractfactory.os.mac;


import abstractfactory.ui.component.Checkbox;

// Concrete product class for macOS checkbox
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
