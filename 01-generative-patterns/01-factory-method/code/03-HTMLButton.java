public class HTMLButton implements Button {

    // Вернуть HTML-код кнопки.
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    // Навесить на кнопку обработчик события браузера.
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}