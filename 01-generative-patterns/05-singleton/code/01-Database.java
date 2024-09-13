/**
 * Класс одиночки определяет статический метод `getInstance`, который позволяет клиентам повторно использовать одно и то же подключение к базе данных по всей программе.
 */
public class Database {

    // Поле для хранения объекта-одиночки должно быть объявлено статичным.
    private static Database instance;

    /*
        Конструктор одиночки всегда должен оставаться приватным, чтобы клиенты не могли самостоятельно создавать
        экземпляры этого класса через оператор `new`.
    */
    private Database() {
        /*
            Здесь может жить код инициализации подключения к серверу баз данных.
            ...
         */

    }

    /*
        Основной статический метод одиночки служит альтернативой конструктору и является точкой доступа к экземпляру
        этого класса.
    */
    public static Database getInstance() {
        if (Database.instance == null) {
         /*
             На всякий случай ещё раз проверим, не был ли объект создан другим потоком, пока текущий ждал освобождения
             блокировки.
         */
            if (acquireThreadLock()) {
                if (Database.instance == null) {
                    Database.instance = new Database();
                }
            }
        }
        return Database.instance;
    }

    /*
        Наконец, любой класс одиночки должен иметь какую-то полезную функциональность, которую клиенты будут запускать
        через полученный объект одиночки.
    */
    public void query(sql) {
        /*
            Все запросы к базе данных будут проходить через этот метод. Поэтому имеет смысл поместить сюда какую-то
            логику кеширования.
            ...
         */
    }
}