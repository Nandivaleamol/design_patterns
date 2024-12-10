package abstractfactory;

import abstractfactory.factory.GUIFactory;
import abstractfactory.ui.component.Button;
import abstractfactory.ui.component.Checkbox;

// Client Code
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
