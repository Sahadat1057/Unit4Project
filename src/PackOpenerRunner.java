import java.util.ArrayList;
public class PackOpenerRunner {
    public static void main(String[] args) {

      /*  String[] allCards = new String[]{"91 Gold, Robert Lewandowski, FC Barcelona, ST", "92 Gold, Kylian Mbappe, Paris Saint Germain, ST", "85 Gold, Rakitic, Sevilla FC, CM"};
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
        System.out.println("Random Card Picked is: " + allsilverCards.get(silverRandomPicker)); */

        System.out.println("Hello Welcome to FIFA Pack Opener!");
        System.out.println();
        System.out.println("You have been given 5000 coins to start off with.");
        System.out.println();
        System.out.println("The goal is simple, you get to open packs of your choosing costing a certain number of coins depending on the type of cards that are available within that pack");
        System.out.println();
        System.out.println("The goal is to get the highest overall player");
        System.out.println();
        System.out.println("There are 4 different types of packs available: bronze, silver, gold, special");
        System.out.println("Bronze costs 1000 coins to open, Silver cost 2000 coins, Gold costs 3000 coins, while Special costs 4000 coins");
        System.out.println("Please select which pack you would like to open");
    }

}
