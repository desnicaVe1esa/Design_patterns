/**
 * Несмотря на то, что фабрики оперируют конкретными классами, их методы возвращают абстрактные типы продуктов. Благодаря
 * этому фабрики можно взаимозаменять, не изменяя клиентский код.
 */
public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}