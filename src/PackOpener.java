import java.util.ArrayList;

public class PackOpener {
    private int coins;
    private int overallValue;
    private int playerPackChoice;
    public ArrayList allsilverCards;
    ;
    public String[] silverCards;

    public PackOpener() {
        String[] silverCards = new String[]{"76 Silver, Dan Burn, CB", "79 Silver, Ronald Araujo, CB"};
        ArrayList<String> allsilverCards = new ArrayList<String>();
        for(int i = 0; i < silverCards.length; i++ ) {
            allsilverCards.add(silverCards[i]);
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


    public static String openSilverPack () {
        int silverRandomPicker = (int) (Math.random() * 2);
        return "Random Card Picked is: " + allsilverCards.get(silverRandomPicker);
    }
}


