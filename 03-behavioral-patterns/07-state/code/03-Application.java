/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}