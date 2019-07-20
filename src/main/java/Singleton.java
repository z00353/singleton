public class Singleton {
    // (1) INSTANCE constant that holds the sole instance
    private static final Singleton INSTANCE = new Singleton();
    // (2) Private hidden constructor
    private Singleton() {}
    // (3) Static operation which returns the whole instance
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
