/**
 * Паттерн Фабричный метод применим тогда, когда в программе есть иерархия классов продуктов.
 */
public interface Button {

    void render();

    void onClick();
}