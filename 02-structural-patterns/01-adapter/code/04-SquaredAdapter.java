/**
 * Адаптер позволяет использовать квадратные колышки и круглые отверстия вместе.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;


    }

    // Вычислить половину диагонали квадратного колышка по теореме Пифагора.
    public int getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;

    }
}

