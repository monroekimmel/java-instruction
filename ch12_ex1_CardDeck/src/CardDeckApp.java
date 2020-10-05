import java.util.ArrayList;
import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
       // String[] deck = getDeck();
        ArrayList<String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static ArrayList<String> getDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King"};   
        
        //string deck = new string

        ArrayList<String> deck = new ArrayList<>();
        //int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                //deck[i] = rank + " of " + suit;
            	String cardStr = rank + " of " + suit;
            	deck.add(cardStr);
                //i++;
            }
        }
        return deck;
    }

    //private static void displayCards(String[] cards) {
    	private static void displayCards(String[] cards) {
        System.out.print("|");       
        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        
        System.out.println();        
    }

    private static void shuffleDeck(String[] deck) {
//        for (int i = 0; i < deck.length; i++) {
//            String savedCard = deck[i];
//            int randomIndex = (int) (Math.random() * deck.length-1);
//            deck[i] = deck[randomIndex];
//            deck[randomIndex] = savedCard;
            
            for (int 1 = 0; 1 < deck.size(); ++1);
            	String savedCard = deck.get(i);  
            	int randomIndex = (int) (Math.random() * deck.size() - 1);
            	deck.set(i, deck.get(randomeIndex));
            	deck.set(randomIndex, savedCard);
            	}

  //  private static String[] dealCards(String[] deck, int count)
    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) {
        String[] hand = Arrays.copyOfRange(deck, 0, count);
        return hand;
    }
}