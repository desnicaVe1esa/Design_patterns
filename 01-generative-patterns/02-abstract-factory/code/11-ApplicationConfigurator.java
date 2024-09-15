/**
 * Приложение выбирает тип конкретной фабрики и создаёт её динамически, исходя из конфигурации или окружения.
 */
public class ApplicationConfigurator {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
