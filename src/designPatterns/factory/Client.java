package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropDown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter androidFlutter = new Flutter(ComponentConfiguration.ANDROID);
        UIFactory uiFactory = androidFlutter.createUIFactory();
        androidFlutter.setTheme();
        androidFlutter.setRefreshRate();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();

        Flutter windowsFlutter = new Flutter(ComponentConfiguration.WINDOWS);
        windowsFlutter.setRefreshRate();
        windowsFlutter.setTheme();
        UIFactory uiFactory1 = windowsFlutter.createUIFactory();
        Menu menu1 = uiFactory1.createMenu();
        Button button1 = uiFactory1.createButton();
        DropDown dropDown1 = uiFactory1.createDropDown();
    }
}
