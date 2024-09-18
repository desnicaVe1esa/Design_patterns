/**
 * Интерфейс посетителей должен содержать методы посещения каждого элемента. Важно, чтобы иерархия элементов менялась
 * редко, так как при добавлении нового элемента придётся менять всех существующих посетителей.
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}