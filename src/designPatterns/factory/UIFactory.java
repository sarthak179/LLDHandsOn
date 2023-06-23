package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.menu.Menu;

public interface UIFactory {
    public Menu createMenu();
    public Button createButton();
    public DropDown createDropDown();
}
