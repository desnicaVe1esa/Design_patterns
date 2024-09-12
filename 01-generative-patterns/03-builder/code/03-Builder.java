/**
 * Интерфейс строителя объявляет все возможные этапы и шаги конфигурации продукта.
 */
public interface Builder {
    void reset();

    void setSeats(...);

    void setEngine(...);

    void setTripComputer(...);

    void setGPS(...);
}
