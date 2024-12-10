package abstractfactory.factory;

import abstractfactory.os.mac.MacOSButton;
import abstractfactory.os.mac.MacOSCheckbox;
import abstractfactory.ui.component.Button;
import abstractfactory.ui.component.Checkbox;

// Concrete Factory for macOS
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
