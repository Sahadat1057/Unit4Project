import java.util.ArrayList;
public class PackOpener {
    private int coins = 20000;
    private int playerPackChoice;
    private int playerGameChoice;
    private boolean isGameOver = false;

    private boolean zeroCoins = false;

    private ArrayList<String> allBronzeCards;
    private ArrayList<String> allSilverCards;
    private ArrayList<String> allGoldCards;

    private ArrayList<String> allSpecialCards;

    private ArrayList<Integer> receivedCards;

    /** This constructor will create the bronze, silver, gold and special lists and turn them into array lists so operations can be done on them. Also, creates the received cards array list.
     * @return
     */
    public PackOpener() {
        String[] bronzeCards = new String[]{"64 Bronze, Yerson Mosquera, Wolves FC, CB", "64 Bronze, Matthew Smith, Arsenal FC, CDM", "62 Bronze, Romeo Lavia, Southampton FC, CDM", "59 Bronze, Evan Ferguson, Brighton FC, ST", "60 Bronze, James Norris, Liverpool FC, LB"};
        allBronzeCards = new ArrayList<String>();
        for (int i = 0; i < bronzeCards.length; i++) {
            allBronzeCards.add(bronzeCards[i]);
        }

        String[] silverCards = new String[]{"74 Silver, Ashley Young, Aston Villa FC, LM", "74 Silver, Ryan Bertrand, Leicester City FC, LB", "71 Silver, Neco Williams, Nottingham Forrest, RB", "70 Silver, Tim Ream, Fulham FC, CB", "70 Silver, Flynn Downes, West Ham United, CM"};
        allSilverCards = new ArrayList<String>();
        for (int i = 0; i < silverCards.length; i++) {
            allSilverCards.add(silverCards[i]);
        }

        String[] goldCards = new String[]{"91 Gold, Robert Lewandowski, FC Barcelona, ST", "92 Gold, Kylian Mbappe, Paris Saint Germain, ST", "85 Gold, Ivan Rakitic, Sevilla FC, CM", "91 Gold, Lionel Messi, Paris Saint Germain, CAM", "90 Gold, Cristiano Ronaldo, Manchester United, ST"};
        allGoldCards = new ArrayList<String>();
        for (int i = 0; i < goldCards.length; i++) {
            allGoldCards.add(goldCards[i]);
        }

        String[] specialCards = new String[]{"98 Icon, Pele, Icon FC, CAM", "96 Icon, Ronaldo, Icon FC, ST", "96 Icon, Zinedine Zidane, Icon FC, CAM", "94 Icon, Cruyff, Icon FC, CF", "94 Icon, Lev Yashin, Icon FC, GK"};
        allSpecialCards = new ArrayList<String>();
        for (int i = 0; i < specialCards.length; i++) {
            allSpecialCards.add(specialCards[i]);
        }

        receivedCards = new ArrayList<Integer>();
    }

    /**
     * This constructor has 3 parameters int coins, boolean isGameOver, boolean zeroCoins
     * @param coins sets this.coins to coins and is used to set coins to 20000 in the runner class
     * @param isGameOver sets this.isGameOver to isGameOver and is set to false in the runner class
     * @param zeroCoins sets this.zeroCoins to zeroCoins and is set to false in the runner class
     */
    public PackOpener(int coins, boolean isGameOver, boolean zeroCoins) {
        this.isGameOver = isGameOver;
        this.coins = coins;
        this.zeroCoins = zeroCoins;
    }

    /**
     * This method will use the user input 'choice' and set it to playerPackChoice to an int value, so when playerPackChoice is used as a conditional in the openPack() method, that method will know which specific pack the user wants to open
     * @param choice is the user pack choice input
     */
    public void playerPackChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("bronze")) playerPackChoice = 1;
        if (choice.equals("silver")) playerPackChoice = 2;
        if (choice.equals("gold")) playerPackChoice = 3;
        if (choice.equals("special")) playerPackChoice = 4;
    }

    /**
     * This method uses a playerPackChoice and coins conditionals to get a random card by using Math.random, it will also subtract the specific amount of coins given the pack chosen, and creates a substring which will be parsed to be added to an integer array list for the highestValueCard() method
     * @return
     */
    public String openPack() {
         if (playerPackChoice == 1 && coins >= 1000) {
            int bronzeRandomPicker = (int) (Math.random() * 5);
            coins = coins - 1000;
            String bronzeCardReceived = allBronzeCards.get(bronzeRandomPicker);
            String overallBronze = bronzeCardReceived.substring(0,2);
            int bronzeCardValue = Integer.parseInt(overallBronze);
            receivedCards.add(bronzeCardValue);
            return "Random Card Picked is: " + bronzeCardReceived + "\n" + "Coins: " + coins;
        }
        else if (playerPackChoice == 1 && coins < 1000 && coins > 0) {
            return "Not enough coins";
        }
        else if (playerPackChoice == 2 && coins >= 2000) {
            int silverRandomPicker = (int) (Math.random() * 5);
            coins = coins - 2000;
            String silverCardReceived = allSilverCards.get(silverRandomPicker);
            String overallSilver = silverCardReceived.substring(0,2);
            int silverCardValue = Integer.parseInt(overallSilver);
            receivedCards.add(silverCardValue);
            return "Random Card Picked is: " + silverCardReceived + "\n" + "Coins: " + coins;
        }
        else if (playerPackChoice == 2 && coins < 2000 && coins > 0) {
            return "Not enough coins";
        }
        else if (playerPackChoice == 3 && coins >= 3000) {
            int goldRandomPicker = (int) (Math.random() * 5);
            coins = coins - 3000;
            String goldCardReceived = allGoldCards.get(goldRandomPicker);
            String overallGold = goldCardReceived.substring(0,2);
            int goldCardValue = Integer.parseInt(overallGold);
            receivedCards.add(goldCardValue);
            return "Random Card Picked is: " + goldCardReceived + "\n" + "Coins: " + coins;
        }
        else if (playerPackChoice == 3 && coins < 3000 && coins > 0) {
            return "Not enough coins";
        }
        else if(playerPackChoice == 4 && coins >= 4000) {
            int specialRandomPicker = (int) (Math.random() * 5);
            coins = coins - 4000;
            String specialCardReceived = allSpecialCards.get(specialRandomPicker);
            String overallSpecial = specialCardReceived.substring(0,2);
            int specialCardValue = Integer.parseInt(overallSpecial);
            receivedCards.add(specialCardValue);
            return "Random Card Picked is: " + specialCardReceived + "\n" + "Coins: " + coins;
         }
        else if (playerPackChoice == 4 && coins < 4000 && coins > 0) {
            return "Not enough coins";
         }

        return "Game is over";
    }

    /**
     * This method will use the parsed integers given by the openPack() method and will use a for loop to find the highest overall card value
     * @return
     */
    public String highestValueCard () {
        int startingValue = receivedCards.get(0);
        for(int i = 0; i < receivedCards.size(); i++ ) {
            if(startingValue < receivedCards.get(i)) {
                startingValue = receivedCards.get(i);
            }
        }
        return "" + startingValue;

    }

    /**
     * This method will use the user input of 'gameChoice' and sets playerGameChoice to an int value, so when playerGameChoice conditional is used on isGameOver(), the computer will know if the game is over or not
     * @param gameChoice
     */
    public void gameChoice(String gameChoice) {
        gameChoice = gameChoice.toLowerCase();
        if (gameChoice.equals("yes")) playerGameChoice = 1;
        if (gameChoice.equals("no")) playerGameChoice = 2;
    }

    /**
     * This method will check if coins is equal to zero, and if zeroCoins = true the while loop in the runner class would end ending the game
     * @return
     */
    public boolean zeroCoins() {
        if(coins == 0) {
            return zeroCoins = true;
        }
        else if (coins != 0) {
            return zeroCoins = false;
        }
        return zeroCoins = false;

    }

    /**
     * This method will use conditionals based on the playerGameChoice and zeroCoins values in playerPackChoice() and zeroCoins() to see if the game is over or not
     * @return
     */
    public boolean isGameOver() {
        if (playerGameChoice == 1) {
            return isGameOver = false;
        }
        else if (playerGameChoice == 2 ) {
            return isGameOver = true;
        }
        else if (coins == 0) {
            return isGameOver = true;
        }
        else return false;


    }

    /**
     * This method will display the highest overall value card and the game is over message when the game is over
     * @return
     */
    public String toString() {
        String displayHighestValueCard = "Highest Overall Card: " + highestValueCard() + "\n";
        String gameOver = "Game is over!";
        return displayHighestValueCard + gameOver;
    }
}


