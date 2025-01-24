import java.util.Random;
import java.util.Scanner;

public class Encounter {
    private Player player;
    private Area currentArea;

    public Encounter(Player player, Area currentArea) {
        this.player = player;
        this.currentArea = currentArea;
    }

    public void startEncounter() {
        Cryptid cryptid = currentArea.getQueue().poll();

        System.out.println("You encounter a " + cryptid.getCryptidName() + "!");
        System.out.println("Description: " + cryptid.getCryptidDescription());
        System.out.println("Difficulty: " + cryptid.getCryptidDifficulty());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to try to capture it? (Y/N)");

        String answer = scanner.nextLine().toUpperCase();

        System.out.println();

        if (answer.equals("Y")) {

            boolean captureGameResult = captureGame(cryptid); // Start the Capture Game 

            if (captureGameResult) {
                System.out.println("You successfully captured the " + cryptid.getCryptidName() + "!");
                player.increaseSkill(cryptid.getCryptidDifficulty());
                player.addCapturedCryptid(cryptid);
                System.out.println();
            } else {
                System.out.println("You failed to capture the " + cryptid.getCryptidName() + ".");
                currentArea.addCryptid(cryptid);
                System.out.println();
            }

        } else {
            System.out.println("You chose not to pursue the " + cryptid.getCryptidName() + ".");
            currentArea.addCryptid(cryptid);
            System.out.println();
        }

    }

    private boolean captureGame(Cryptid cryptid) {
        Random rand = new Random();
        int cryptidDifficulty = cryptid.getCryptidDifficulty();
        int streak = 0;
        int roundsToWin = cryptidDifficulty;
        int maxAttempts = cryptidDifficulty + 3;
        int range = 100; // Range of values for the high/low game 

        System.out.println("=== Capture The Cryptid ===");
        System.out.println("Rules: You need a streak of " + roundsToWin + " correct guesses to win.");
        System.out.println("You have " + maxAttempts + " total attempts. Good luck!");
        System.out.println("====================");

        Scanner scanner = new Scanner(System.in);

        for (int attempts = 0; attempts < maxAttempts; attempts++) {

            System.out.println("\n--- Attempt " + (attempts + 1) + " of " + maxAttempts + " ---");
            System.out.println("Streak so far: " + streak + "/" + roundsToWin);
            System.out.println("You need " + (roundsToWin - streak) + " more correct guesses in a row to win.");
            System.out.println();

            int currentValue = rand.nextInt(range) + 1;
            int nextValue = rand.nextInt(range) + 1;

            System.out.println("Current value: " + currentValue);
            System.out.println("Will the next value be higher or lower? (Type 'H' or 'L')");

            String guess = scanner.nextLine().toUpperCase();

            System.out.println();
            System.out.println("The next value is: " + nextValue);

            System.out.println();

            if ((guess.equals("H") && nextValue > currentValue) ||
                (guess.equals("L") && nextValue < currentValue)) {
                streak++;
                System.out.println("You were correct! Streak: " + streak + "/" + roundsToWin);
                System.out.println();

                if (streak == roundsToWin) {
                    return true;
                }
            } else {
                streak = 0;
                System.out.println("You were incorrect! Your streak has been reset to 0.");
                System.out.println();
            }

            //End early if it's no longer possible for the player to win
            if ((maxAttempts - (attempts + 1)) < (roundsToWin - streak)) {
                System.out.println("You no longer have enough attempts to capture the " + cryptid.getCryptidName());
                System.out.println();
                return false;
            }

            System.out.println("Attempts remaining: " + (maxAttempts - attempts - 1));
            System.out.println();

        }

        return false;
    }
}