/**
 * Семейства продуктов имеют те же вариации (macOS/Windows).
 */
public class WinButton implements Button {

    // Отрисовать кнопку в стиле Windows.
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}