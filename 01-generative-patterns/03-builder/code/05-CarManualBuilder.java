/**
 * В отличие от других порождающих паттернов, где продукты должны быть частью одной иерархии классов или следовать
 * общему интерфейсу, строители могут создавать совершенно разные продукты, которые не имеют общего предка.
 */
public class CarManualBuilder implements Builder {
    private Manual manual;

    // Поместить новый объект Manual в поле "manual".
    public void reset() {
    }


    // Описать, сколько мест в машине.
    public void setSeats(...) {
    }

    // Добавить в руководство описание двигателя.
    public void setEngine(...) {
    }

    // Добавить в руководство описание системы навигации.
    public void setTripComputer(...) {
    }

    // Добавить в инструкцию инструкцию GPS.
    public void setGPS(...) {
    }

    // Вернуть текущий объект руководства.
    public Manual getResult() {
    }
}
