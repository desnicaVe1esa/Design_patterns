public class HTMLButton implements Button {

    // Вернуть HTML-код кнопки.
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    // Навесить на кнопку обработчик события браузера.
    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}