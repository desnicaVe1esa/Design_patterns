/**
 * Метод принятия посетителя должен быть реализован в каждом элементе, а не только в базовом классе. Это поможет
 * программе определить, какой метод посетителя нужно вызвать, если вы не знаете тип элемента.
 */
public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        // переместить фигуру
    }

    @Override
    public void draw() {
        // нарисовать форму
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}