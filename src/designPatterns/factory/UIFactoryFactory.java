package designPatterns.factory;

public class UIFactoryFactory {
    public static ComponentConfiguration componentConfiguration;

    public UIFactoryFactory(ComponentConfiguration cf) {
        this.componentConfiguration = cf;
    }

    public static UIFactory getFactory() {
        return switch (componentConfiguration) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
