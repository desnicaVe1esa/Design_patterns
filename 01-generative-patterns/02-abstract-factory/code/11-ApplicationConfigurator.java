/**
 * Приложение выбирает тип конкретной фабрики и создаёт её динамически, исходя из конфигурации или окружения.
 */
public class ApplicationConfigurator {
    public void main() {
        config = readApplicationConfigFile();
        if (config.OS == "Windows") {
            factory = new WinFactory();
        } else if (config.OS == "Mac") {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        Application app = new Application(factory);
    }
}
