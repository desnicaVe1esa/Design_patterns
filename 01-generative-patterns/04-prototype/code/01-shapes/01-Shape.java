/**
 * Базовый прототип.
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    // Обычный конструктор.
    public Shape() {
    }

    // Конструктор прототипа.
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // Результатом операции клонирования всегда будет объект из иерархии классов Shape.
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) {
            return false;
        }
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}