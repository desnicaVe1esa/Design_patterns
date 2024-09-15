/**
 * Адаптер позволяет использовать квадратные колышки и круглые отверстия вместе.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        /*
            Вычислить половину диагонали квадратного колышка по теореме Пифагора. Рассчитываем минимальный радиус,
            в который пролезет этот колышек.
        */
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }

}

