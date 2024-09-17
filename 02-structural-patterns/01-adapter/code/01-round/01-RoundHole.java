/**
 * Классы с совместимыми интерфейсами: КруглоеОтверстие и КруглыйКолышек.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    // Вернуть радиус отверстия.
    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}