/**
 * Общий интерфейс итераторов.
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}