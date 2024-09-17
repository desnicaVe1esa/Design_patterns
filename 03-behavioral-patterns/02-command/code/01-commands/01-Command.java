/**
 * Абстрактная команда задаёт общий интерфейс для конкретных классов команд и содержит базовое поведение отмены операции.
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // Сохраняем состояние редактора.
    void backup() {
        backup = editor.textField.getText();
    }

    // Восстанавливаем состояние редактора.
    public void undo() {
        editor.textField.setText(backup);
    }

    /*
        Главный метод команды остаётся абстрактным, чтобы каждая конкретная команда определила его по-своему. Метод должен
        возвратить true или false в зависимости о того, изменила ли команда состояние редактора, а значит, нужно ли её
        сохранить в истории.
     */
    public abstract boolean execute();
}