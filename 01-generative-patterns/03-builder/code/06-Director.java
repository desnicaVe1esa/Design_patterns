/**
 * Директор знает, в какой последовательности нужно заставлять работать строителя, чтобы получить ту или иную версию
 * продукта. Заметьте, что директор работает со строителем через общий интерфейс, благодаря чему он не знает тип
 * продукта, который изготовляет строитель.
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
