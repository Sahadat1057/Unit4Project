import java.util.ArrayList;
public class PackOpenerRunner {
    public static void main(String[] args) {

        String[] allCards = new String[]{"91 Gold, Robert Lewandowski, FC Barcelona, ST", "92 Gold, Kylian Mbappe, Paris Saint Germain, ST", "85 Gold, Rakitic, Sevilla FC, CM"};
        String[] silverCards = new String[]{"76 Silver, Dan Burn, CB", "79 Silver, Ronald Araujo, CB"};

        ArrayList<String> allplayerCards = new ArrayList<String>();
        for(int i = 0; i < allCards.length; i++ ) {
            allplayerCards.add(allCards[i]);
        }

        ArrayList<String> allsilverCards = new ArrayList<String>();
        for(int i = 0; i < silverCards.length; i++ ) {
            allsilverCards.add(silverCards[i]);
        }

        int randomPicker = (int)(Math.random()*3);
        System.out.println("Random Card Picked is: " + allplayerCards.get(randomPicker));

        int silverRandomPicker = (int) (Math.random()*2);
        System.out.println("Random Card Picked is: " + allsilverCards.get(silverRandomPicker));
    }

}
