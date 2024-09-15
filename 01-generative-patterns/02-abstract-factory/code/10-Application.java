/**
 * Для кода, использующего фабрику, не важно, с какой конкретно фабрикой он работает. Все получатели продуктов работают
 * с ними через общие интерфейсы.
 */
public class Application {

    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}