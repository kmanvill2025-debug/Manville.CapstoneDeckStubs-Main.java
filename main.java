    public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();

        deck.createDeck();

        for (Card c : deck.getCards())
        {
            System.out.println(c);
        }
    }
}
