import java.util.Scanner;
public class PackOpenerRunner {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Hello Welcome to FIFA Pack Opener!");
        System.out.println("You have been given 20000 coins to start off with.");
        System.out.println();
        System.out.println("The goal is simple, open packs to get the highest overall player possible.");
        System.out.println();
        System.out.println("There are 4 different types of packs available: bronze, silver, gold, special");
        System.out.println("Bronze costs 1000 coins");
        System.out.println("Silver costs 2000 coins");
        System.out.println("Gold costs 3000 coins");
        System.out.println("Special costs 4000 coins");
        System.out.println();

        Scanner s = new Scanner(System.in);
        PackOpener g = new PackOpener();
        PackOpener c = new PackOpener(20000, false, false);

        while (c.isGameOver() == false && g.zeroCoins() == false ) {
            System.out.print("Please select which pack you would like to open: ");
            String choice = s.nextLine();
            g.playerPackChoice(choice);
            System.out.println(g.openPack());
            if (g.zeroCoins() == false) {
                System.out.println("Do you want to continue?");
                String gameChoice = s.nextLine();
                c.gameChoice(gameChoice);
            }
        }

        System.out.println(g.toString());
    }

}
