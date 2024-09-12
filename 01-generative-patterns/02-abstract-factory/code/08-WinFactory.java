/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}