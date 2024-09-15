public class Application {

    private static Dialog dialog;

    // Приложение создаёт определённую фабрику в зависимости от конфигурации или окружения.
    public static void initialize() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    /*
        Если весь остальной клиентский код работает с фабриками и продуктами только через общий интерфейс, то для него
        будет не важно, какая фабрика была создана изначально.
    */
    public static void main(String[] args) {
        initialize();
        dialog.render();
    }
}