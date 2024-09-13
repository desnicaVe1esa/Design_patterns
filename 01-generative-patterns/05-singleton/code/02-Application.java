public class Application {
    public main() {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        // ...
        // Переменная "bar" содержит тот же объект, что и переменная "foo".
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
    }
}
