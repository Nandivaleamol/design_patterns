package abstractfactory.os.win;

import abstractfactory.ui.component.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have crated Windows Checkbox");
    }
}
