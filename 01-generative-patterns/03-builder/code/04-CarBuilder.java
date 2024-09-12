/**
 * Все конкретные строители реализуют общий интерфейс по-своему.
 */
public class CarBuilder implements Builder {

    private Car car;

    // Поместить новый объект Car в поле "car".
    public void reset() {
    }

    // Установить указанное количество сидений.
    public void setSeats(...) {
    }

    // Установить поданный двигатель.
    public void setEngine(...) {
    }

    // Установить поданную систему навигации.
    public void setTripComputer(...) {
    }

    // Установить или снять GPS.
    public void setGPS(...) {
    }

    // Вернуть текущий объект автомобиля.
    public CarBuilder getResult() {
    }
}
