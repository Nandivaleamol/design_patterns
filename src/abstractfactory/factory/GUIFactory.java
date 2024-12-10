package abstractfactory.factory;

import abstractfactory.ui.component.Button;
import abstractfactory.ui.component.Checkbox;

// Abstract Factory for creating GUI components
public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
