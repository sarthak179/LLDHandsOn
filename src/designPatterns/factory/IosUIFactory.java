package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IosButton;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.dropDown.IosDropDown;
import designPatterns.factory.components.menu.IosMenu;
import designPatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
