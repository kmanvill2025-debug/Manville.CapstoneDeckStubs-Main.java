import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();
    }

    // creates a full 52 card deck
    public void createDeck()
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };

        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public ArrayList<Card> getCards()
    {
        return cards;
    }
}
