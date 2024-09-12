/**
 * Для кода, использующего фабрику, не важно, с какой конкретно фабрикой он работает. Все получатели продуктов работают
 * с ними через общие интерфейсы.
 */
public class Application {

    private GUIFactory factory;

    private Button button

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}