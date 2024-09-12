/**
 * Директор получает объект конкретного строителя от клиента (приложения). Приложение само знает, какого строителя нужно
 * использовать, чтобы получить определённый продукт.
 */
public class Application {
    public void makeCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        CarManualBuilder builder = new CarManualBuilder();
        director.constructSportsCar(builder);
        /*
            Готовый продукт возвращает строитель, так как директор чаще всего не знает и не зависит от конкретных классов
            строителей и продуктов.
         */
        Manual manual = builder.getResult();
    }
}
