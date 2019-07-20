public class MyApp {
    public static void main(String[] args) {
        Singleton callOne;
        Singleton callTwo;

        callOne = Singleton.getInstance();
        callTwo = Singleton.getInstance();
        if (callOne == callTwo) {
            // The two singleton references are identical
            System.out.println("Singleton instantiated only once");
        }
    }
}
