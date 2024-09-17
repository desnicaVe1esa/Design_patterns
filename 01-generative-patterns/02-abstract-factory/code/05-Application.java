/**
 * Приложение выбирает тип конкретной фабрики и создаёт её динамически, исходя из конфигурации или окружения.
 */
public class Application {

    private static ApplicationConfigurator configureApplication() {
        ApplicationConfigurator app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        app = new ApplicationConfigurator(factory);
        return app;
    }

    public static void main(String[] args) {
        ApplicationConfigurator app = configureApplication();
        app.paint();
    }
}
