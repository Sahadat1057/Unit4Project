import java.util.ArrayList;
public class PackOpener {
    private int coins = 5000;
    private int highestValue;
    private int playerPackChoice;
    private int playerGameChoice;
    private boolean isGameOver = false;
    private ArrayList<String> allGoldCards;
    private ArrayList<String> allSilverCards;
    private ArrayList<String> allBronzeCards;

    public PackOpener() {
        String[] silverCards = new String[]{"76 Silver, Dan Burn, CB", "79 Silver, Ronald Araujo, CB"};
        allSilverCards = new ArrayList<String>();
        for (int i = 0; i < silverCards.length; i++) {
            allSilverCards.add(silverCards[i]);
        }

        String[] goldCards = new String[]{"91 Gold, Robert Lewandowski, FC Barcelona, ST", "92 Gold, Kylian Mbappe, Paris Saint Germain, ST", "85 Gold, Rakitic, Sevilla FC, CM"};
        allGoldCards = new ArrayList<String>();
        for (int i = 0; i < goldCards.length; i++) {
            allGoldCards.add(goldCards[i]);
        }

        String[] bronzeCards = new String[]{"51 Bronze, Harry Maguire, Manchester United, CB", "52 Bronze, Wan Bissaka, Manchester United, RB"};
        allBronzeCards = new ArrayList<String>();
        for (int i = 0; i < bronzeCards.length; i++) {
            allBronzeCards.add(bronzeCards[i]);
        }
    }

    public PackOpener(int coins, boolean isGameOver) {
        this.isGameOver = isGameOver;
        this.coins = coins;
    }

    public void playerPackChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("bronze")) playerPackChoice = 1;
        if (choice.equals("silver")) playerPackChoice = 2;
        if (choice.equals("gold")) playerPackChoice = 3;
        if (choice.equals("special")) playerPackChoice = 4;
    }


    public String openPack() {
        if (playerPackChoice == 2 && coins >= 2000) {
            int silverRandomPicker = (int) (Math.random() * 2);
            coins = coins - 2000;
            return "Random Card Picked is: " + allSilverCards.get(silverRandomPicker) + "\n" + "Coins: " + coins;
        }
        else if (playerPackChoice == 2 && coins < 2000 && coins > 0) {
            return "Not enough coins";
        }
        else if (playerPackChoice == 3 && coins >= 3000) {
            int goldRandomPicker = (int) (Math.random() * 3);
            coins = coins - 3000;
            return "Random Card Picked is: " + allGoldCards.get(goldRandomPicker) + "\n" + "Coins: " + coins;

        }
        else if (playerPackChoice == 3 && coins < 3000 && coins > 0) {
            return "Not enough coins";
        }
        else if (playerPackChoice == 1 && coins >= 1000) {
            int bronzeRandomPicker = (int) (Math.random() * 2);
            coins = coins - 1000;
            return "Random Card Picked is: " + allBronzeCards.get(bronzeRandomPicker) + "\n" + "Coins: " + coins;
        }
        else if (playerPackChoice == 1 && coins < 1000 && coins > 0) {
            return "Not enough coins";
        }
        return "Game is over";
    }


    public void gameChoice(String gameChoice) {
        gameChoice = gameChoice.toLowerCase();
        if (gameChoice.equals("yes")) playerGameChoice = 1;
        if (gameChoice.equals("no")) playerGameChoice = 2;
        // Do the same thing I did with user input for pack choice
        // Ask user do you want to continue
        // User will put yes or no
        // Then create isGameOver method based on that
        // In the main class use the same thing Mr. Das used and then I'm done
    }

    public boolean enoughCoins() {
        if(coins == 0) {
            return isGameOver = true;
        }
        return isGameOver = false;
    }
    public boolean isGameOver() {
        if (playerGameChoice == 1) {
            return isGameOver = false;
        }
        else if (playerGameChoice == 1 && coins == 0 || playerGameChoice == 1 && coins == 0 || playerGameChoice == 1 && coins == 0){
            return isGameOver = true;
        }
        else if (playerGameChoice == 2 ) {
            return isGameOver = true;
        }
        else return false;


    }

    public String gameOver() {
        if (isGameOver = true) {
            return "Game is over!";
        }
        return "";


    }
}


