/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}