/**
 * Конкретный класс-издатель, содержащий интересную для других  компонентов бизнес-логику. Мы могли бы сделать его
 * прямым потомком EventManager, но в реальной жизни это не всегда возможно (например, если у класса уже есть родитель).
 * Поэтому здесь мы подключаем механизм подписки при помощи композиции.
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    // Методы бизнес-логики, которые оповещают подписчиков об изменениях.
    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}