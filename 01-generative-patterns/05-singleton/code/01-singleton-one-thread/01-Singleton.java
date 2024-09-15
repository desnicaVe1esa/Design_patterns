public final class Singleton {

    // Поле для хранения объекта-одиночки должно быть объявлено статичным.
    private static Singleton instance;
    public String value;
    /*
        Конструктор одиночки всегда должен оставаться приватным, чтобы клиенты не могли самостоятельно создавать
        экземпляры этого класса через оператор `new`.
    */
    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
    /*
        Основной статический метод одиночки служит альтернативой конструктору и является точкой доступа к экземпляру
        этого класса.
    */
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}