/**
 * Абстрактная фабрика знает обо всех абстрактных типах продуктов.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckbox();
}
