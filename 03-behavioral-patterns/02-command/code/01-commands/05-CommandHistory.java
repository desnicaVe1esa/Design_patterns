/**
 * Глобальная история команд — это стек.
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    // Последний зашедший...
    public void push(Command c) {
        // Добавить команду в конец массива-истории.
        history.push(c);
    }

    // ...выходит первым.
    public Command pop() {
        // Достать последнюю команду из массива-истории.
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}