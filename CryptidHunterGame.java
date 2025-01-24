import java.util.Scanner;
import java.util.Stack;

public class CryptidHunterGame {
    public void startGame() {
        GameInitializer initializer = new GameInitializer();

        Player player = initializer.getPlayer();

        initializer.getNav().enterArea();

        // Main gameplay loop
        while (true) {
            Area currentArea = initializer.getNav().getCurrentArea();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose your next move:");
            System.out.println("1. Explore this area."); // Hunt cryptids
            System.out.println("2. Proceed to the next area.");
            System.out.println("3. Backtrack to the previous area.");
            System.out.println("4. View captured cryptids.");
            System.out.print("Enter your choice: ");

            String answer = scanner.nextLine();

            System.out.println();

            switch (answer) {
                case "1":
                    if (currentArea.getQueue().isEmpty()) {
                        System.out.println("Your instincts tell you there are no more cryptids in this region.");
                        System.out.println();
                        break;
                    }

                    Encounter encounter = new Encounter(player, currentArea);
                    encounter.startEncounter();

                    break;

                case "2":
                    if (initializer.getNav().getUpcomingRegionStack().isEmpty()) {
                        System.out.println("There is nowhere else to go!");
                        System.out.println();
                        break;
                    }

                    initializer.getNav().enterArea();
                    break;

                case "3":
                    initializer.getNav().backtrackArea();
                    break;

                case "4":
                    initializer.getPlayer().viewCapturedCryptids();
                    break;

                default:
                    System.out.println("Incorrect input. Please try again.");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("You are part of the Cryptid Apprehension Team (CAT), on a mission to neutralize cryptids before they affect public welfare!");
        System.out.println("Good luck!");
        System.out.println();
        CryptidHunterGame game = new CryptidHunterGame();
        game.startGame();
    }
}