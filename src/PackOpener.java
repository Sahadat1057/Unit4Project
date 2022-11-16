import java.util.ArrayList;
public class PackOpener {
    private int coins;
    private int highestValue;
    private int playerPackChoice;
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
        coins = 5000;
    }

    public void playerPackChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("bronze")) playerPackChoice = 1;
        if (choice.equals("silver")) playerPackChoice = 2;
        if (choice.equals("gold")) playerPackChoice = 3;
        if (choice.equals("special")) playerPackChoice = 4;
    }


    public String openPack() {
        if (playerPackChoice == 2) {
            int silverRandomPicker = (int) (Math.random() * 2);
            return "Random Card Picked is: " + allSilverCards.get(silverRandomPicker);
        }
        if (playerPackChoice == 3) {
            int goldRandomPicker = (int) (Math.random() * 3);
            return "Random Card Picked is: " + allGoldCards.get(goldRandomPicker);
        }
        if (playerPackChoice == 1) {
            int bronzeRandomPicker = (int) (Math.random() * 2);
            return "Random Card Picked is: " + allBronzeCards.get(bronzeRandomPicker);
        }
        return "nothing";
    }

}


