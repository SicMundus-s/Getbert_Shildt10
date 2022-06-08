public class NetworkUtils {
    public static void getConnection() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
