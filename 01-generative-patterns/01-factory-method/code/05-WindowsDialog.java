/**
 * Конкретные фабрики переопределяют фабричный метод и возвращают из него собственные продукты.
 */
public class WindowsDialog extends Dialog {

    public Button createButton() {
        return new WindowsButton();
    }

}
