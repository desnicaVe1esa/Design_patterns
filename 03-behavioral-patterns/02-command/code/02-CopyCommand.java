/**
 * Конкретные команды.
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    // Команда копирования не записывается в историю, так как она не меняет состояние редактора.
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}