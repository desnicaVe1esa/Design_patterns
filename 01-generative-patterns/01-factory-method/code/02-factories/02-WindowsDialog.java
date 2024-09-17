/**
 * Конкретные фабрики переопределяют фабричный метод и возвращают из него собственные продукты.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
