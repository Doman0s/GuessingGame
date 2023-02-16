package template;

import factory.GuessStrategy;
import factory.SmartGuessStrategy;
import singleton.NumberGenerator;

public class NumberGuessingGame extends Game {

    public NumberGuessingGame(NumberGenerator numberGenerator, GuessStrategy guessStrategy) {
        super(numberGenerator, guessStrategy);
    }

    @Override
    public void checkGuess(int guessedNumber) {
        int generatedNumber = numberGenerator.getNumber();

        printGuessedNumber(guessedNumber);

        if (guessedNumber == generatedNumber) {
            numbersEqual(generatedNumber);
        } else if (guessedNumber < generatedNumber) {
            guessedNumberLowerThanGenerated(guessedNumber);
        } else {
            guessedNumberGreaterThanGenerated(guessedNumber);
        }

        getSomeSleep(400);
    }

    private void printGuessedNumber(int guessedNumber) {
        System.out.print("Guessed number is " + guessedNumber + " - ");
    }

    private void numbersEqual(int generatedNumber) {
        System.out.println("You won! The number was: " + generatedNumber);
        gameWon = true;
    }

    private void guessedNumberLowerThanGenerated(int guessedNumber) {
        System.out.println("Too low! Guessing again.");
        if (guessStrategy instanceof SmartGuessStrategy) {
            ((SmartGuessStrategy) guessStrategy).setMin(guessedNumber);
        }
    }

    private void guessedNumberGreaterThanGenerated(int guessedNumber) {
        System.out.println("Too high! Guessing again.");
        if (guessStrategy instanceof SmartGuessStrategy) {
            ((SmartGuessStrategy) guessStrategy).setMax(guessedNumber);
        }
    }

    private void getSomeSleep(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
