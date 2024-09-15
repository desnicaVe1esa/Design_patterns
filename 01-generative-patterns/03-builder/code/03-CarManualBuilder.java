/**
 * В отличие от других порождающих паттернов, где продукты должны быть частью одной иерархии классов или следовать
 * общему интерфейсу, строители могут создавать совершенно разные продукты, которые не имеют общего предка.
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    // Описать, сколько мест в машине.
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    // Добавить в руководство описание двигателя.
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // Добавить в руководство описание системы навигации.
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    // Добавить в инструкцию инструкцию GPS.
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    // Вернуть текущий объект руководства.
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
