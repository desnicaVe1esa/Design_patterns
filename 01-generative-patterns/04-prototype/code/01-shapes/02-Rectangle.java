/**
 * Конкретный прототип. Метод клонирования создаёт новый объект текущего класса, передавая в его конструктор ссылку на
 * собственный объект. Благодаря этому операция клонирования получается атомарной — пока не выполнится конструктор,
 * нового объекта ещё не существует. Но как только конструктор завершит работу, мы получим полностью готовый объект-клон,
 * а не пустой объект, который нужно ещё заполнить.
 */
public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        /*
            Вызов родительского конструктора нужен, чтобы скопировать потенциальные приватные поля, объявленные в
            родительском классе.
        */
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}