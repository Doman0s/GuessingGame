package template;

import factory.GuessStrategy;
import singleton.NumberGenerator;

public abstract class Game {

    NumberGenerator numberGenerator;
    GuessStrategy guessStrategy;
    boolean gameWon = false;

    public Game(NumberGenerator numberGenerator, GuessStrategy guessStrategy) {
        this.numberGenerator = numberGenerator;
        this.guessStrategy = guessStrategy;
    }

    public final void play() {
        while (!gameWon) {
            int guess = guessStrategy.nextGuess();
            checkGuess(guess);
        }
    }

    public abstract void checkGuess(int guess);
}
