package designPatterns.factory;

public class Flutter {
    public ComponentConfiguration componentConfiguration;

    public Flutter(ComponentConfiguration componentConfiguration) {
        this.componentConfiguration = componentConfiguration;
    }
    public void setTheme() {
        System.out.println("set some theme");
    }

    public void setRefreshRate() {
        System.out.println("set some refresh rate");
    }

    public UIFactory createUIFactory() {
        return new UIFactoryFactory(componentConfiguration).getFactory();
    }
}
