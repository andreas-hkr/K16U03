public class Card implements Comparable<Card> {
    static final int CLUBS = 0;
    static final int DIAMONDS = 1;
    static final int HEARTS = 2;
    static final int SPADES = 3;
    private String[] suits = {"Klöver", "Ruter", "Hjärter", "Spader"};
    private String[] ranks = {
            "ess", "två", "tre", "fyra", "fem", "sex", "sju",
            "åtta", "nio", "tio", "knekt", "dam", "kung"
    };

    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        if ((suit >= 0 && suit <= 3) && (rank >= 0 && rank <= 13)) {
            this.suit = suit;
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Felaktigt kort");
        }
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int compareTo(Card c) {
        if ( suit < c.suit) {
            return -1;
        } else if (suit > c.suit) {
            return 1;
        } else {
            if (rank == c.rank) {
                return 0;
            } else if (c.rank == 1) {
                return -1;
            } else if (rank == 1 || rank > c.rank) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return suits[suit] + " " + ranks[rank-1];
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Card c) {
            return suit == c.suit && rank == c.rank;
        }
        return false;
    }
}