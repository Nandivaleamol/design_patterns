package abstractfactory.factory;

import abstractfactory.os.win.WindowsButton;
import abstractfactory.os.win.WindowsCheckbox;
import abstractfactory.ui.component.Button;
import abstractfactory.ui.component.Checkbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
