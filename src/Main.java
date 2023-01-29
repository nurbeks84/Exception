public class Main {
    public static void main(String[] args) {
        try {
            drive();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("машина журуп жатат");
    }

    private static void drive() {
        System.out.println("машина жабылып жатат");
    }
}