import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        double random = Math.round(Math.random() * 10 + 1);
        Scanner sc = new Scanner(System.in);
        String replay;
        char repl;

        do {
            for (int i = 3; i > 0; i--) {
                System.out.println("Guess a number between 1 and 10.");
                double input;
                try {
                    input = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                if (input > random) {
                    System.out.println("Your number may be a bit big. \n You have " + (i - 1) + " tries.");
                } else if (input < random) {
                    System.out.println("Your number may be a bit small. \n You have " + (i - 1) + " tries.");
                } else if (input == random) {
                    System.out.println("You nailed it");
                    break;
                }
            }

            System.out.println("That's it for today. Wanna play again? (y/n)");
            replay = sc.nextLine();
            repl = replay.charAt(0);

        } while (repl == 'y');
    }
}