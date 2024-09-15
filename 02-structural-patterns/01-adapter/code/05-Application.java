public class Application {
    public static void main(String[] args) {
        // Где-то в клиентском коде.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        hole.fits(rpeg); // TRUE
        SquarePeg smallSqpeg = new SquarePeg(5);
        SquarePeg largeSqpeg = new SquarePeg(10);
        hole.fits(smallSqpeg) // Ошибка компиляции, несовместимые типы
        SquarePegAdapter smallSqpegAdapter = new SquarePegAdapter(smallSqpeg);
        SquarePegAdapter largeSqpegAdapter = new SquarePegAdapter(largeSqpeg);
        hole.fits(smallSqpeg) // TRUE
        hole.fits(largeSqpeg) // FALSE
    }
}