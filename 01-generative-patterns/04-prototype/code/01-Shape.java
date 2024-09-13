/**
 * Базовый прототип.
 */
public abstract class Shape {
    private int x;
    private int y;
    private String color;

    // Обычный конструктор.
    public Shape() {
        // ...
    }

    // Конструктор прототипа.
    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    // Результатом операции клонирования всегда будет объект из иерархии классов Shape.
    public abstract Shape clone();
}