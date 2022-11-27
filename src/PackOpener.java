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

    public PackOpener(int coins, boolean isGameOver, boolean zeroCoins) {
        this.isGameOver = isGameOver;
        this.coins = coins;
        this.zeroCoins = zeroCoins;
    }

    public void playerPackChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("bronze")) playerPackChoice = 1;
        if (choice.equals("silver")) playerPackChoice = 2;
        if (choice.equals("gold")) playerPackChoice = 3;
        if (choice.equals("special")) playerPackChoice = 4;
    }


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

    public String highestValueCard () {
        int startingValue = receivedCards.get(0);
        for(int i = 0; i < receivedCards.size(); i++ ) {
            if(startingValue < receivedCards.get(i)) {
                startingValue = receivedCards.get(i);
            }
        }
        return "" + startingValue;

    }




    public void gameChoice(String gameChoice) {
        gameChoice = gameChoice.toLowerCase();
        if (gameChoice.equals("yes")) playerGameChoice = 1;
        if (gameChoice.equals("no")) playerGameChoice = 2;
    }

    public boolean zeroCoins() {
        if(coins == 0) {
            return zeroCoins = true;
        }
        else if (coins != 0) {
            return zeroCoins = false;
        }
        return zeroCoins = false;

    }
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

    public String toString() {
        String displayHighestValueCard = "Highest Overall Card: " + highestValueCard() + "\n";
        String gameOver = "Game is over!";
        return displayHighestValueCard + gameOver;
    }
}


