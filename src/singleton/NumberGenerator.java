package singleton;

import java.util.concurrent.ThreadLocalRandom;

public enum NumberGenerator {

    INSTANCE(
        ThreadLocalRandom.current().nextInt(0, 100)
    );

    private final int number;

    NumberGenerator(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
