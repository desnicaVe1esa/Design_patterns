/**
 * Конкретный прототип. Метод клонирования создаёт новый объект текущего класса, передавая в его конструктор ссылку на
 * собственный объект. Благодаря этому операция клонирования получается атомарной — пока не выполнится конструктор,
 * нового объекта ещё не существует. Но как только конструктор завершит работу, мы получим полностью готовый объект-клон,
 * а не пустой объект, который нужно ещё заполнить.
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Rectangle source) {
    /*
        Вызов родительского конструктора нужен, чтобы скопировать потенциальные приватные поля, объявленные в
        родительском классе.
    */
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Shape clone() {
        return new Rectangle(this)
    }
}