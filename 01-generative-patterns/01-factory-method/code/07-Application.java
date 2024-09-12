public class Application {

    private Dialog dialog;

    // Приложение создаёт определённую фабрику в зависимости от конфигурации или окружения.
    public void initialize() {
        config = readApplicationConfigFile();
        if (config.OS == "Windows") {
            dialog = new WindowsDialog();
        } else if (config.OS == "Web") {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }

    /*
        Если весь остальной клиентский код работает с фабриками и продуктами только через общий интерфейс, то для него
        будет не важно, какая фабрика была создана изначально.
    */
    public void main() {
        this.initialize();
        dialog.render();
    }
}