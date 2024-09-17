/**
 * Общий интерфейс коллекций должен определить фабричный метод для производства итератора. Можно определить сразу
 * несколько методов, чтобы дать пользователям различные варианты обхода одной и той же коллекции.
 */

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}