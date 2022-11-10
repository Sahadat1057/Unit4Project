import java.util.ArrayList;
public class PackOpenerRunner {
    public static void main(String[] args) {


        String[] myStrings = new String[]{"91 Gold, Robert Lewandowski, Position: ST", "92 Gold, Kylian Mbappe, Position: ST", "85 Gold, Rakitic, Position: CM"};

        ArrayList<String> playerCards = new ArrayList<String>();
        for(int i = 0; i < myStrings.length; i++ ) {
            playerCards.add(myStrings[i]);
        }

        int randomPicker = (int)(Math.random()*3);
        System.out.println("Random card picked is: " + playerCards.get(randomPicker));
    }

}
