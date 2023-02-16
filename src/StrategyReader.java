import java.util.Scanner;

public class StrategyReader {
    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        String strategyType = "";
        boolean strategyOk = false;

        printGameInfo();

        while(!strategyOk) {
            strategyType = scanner.nextLine();
            switch (strategyType.toUpperCase()) {
                case "RANDOM", "SMART" -> strategyOk = true;
                default -> System.out.println("Incorrect choice! Write the word \"RANDOM\" or \"SMART\":");
            }
        }

        scanner.close();
        return strategyType;
    }

    private void printGameInfo() {
        System.out.println("\nNumber Guessing Game.");
        System.out.println("Select a guessing strategy by writing: \"RANDOM\" or \"SMART\":");
    }
}
