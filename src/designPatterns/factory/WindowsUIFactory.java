package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.WindowsButton;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.dropDown.WindowsDropDown;
import designPatterns.factory.components.menu.Menu;
import designPatterns.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
