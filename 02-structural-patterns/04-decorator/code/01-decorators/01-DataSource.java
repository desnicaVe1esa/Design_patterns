/**
 * Общий интерфейс компонентов.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}