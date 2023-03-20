public class Main {
    public static void main(String[] args) {
        // Utgå från vår tidigare Card-klass och gör den säker.
        //  - Man skall inte kunna ändra ett korts  färg/valör
        //  - Konstruktor
        //  - Getters

        Card card = new Card(Card.HEARTS, 5);
        System.out.println(card.getRank());
    }
}