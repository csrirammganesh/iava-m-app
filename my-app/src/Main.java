// src/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java Level-2 container!");
        System.out.println("Port 8080 is exposed (container level) for future use.");

        // Keep the container alive so we can test Docker port mapping
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
