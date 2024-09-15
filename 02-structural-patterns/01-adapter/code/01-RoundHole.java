/**
 * Классы с совместимыми интерфейсами: КруглоеОтверстие и КруглыйКолышек.
 */
public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    // Вернуть радиус отверстия.
    public int getRadius() {
        return this.radius;
    }

    public int fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}