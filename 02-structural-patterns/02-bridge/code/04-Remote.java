/**
 * Класс пультов имеет ссылку на устройство, которым управляет. Методы этого класса делегируют работу методам связанного
 * устройства.
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}