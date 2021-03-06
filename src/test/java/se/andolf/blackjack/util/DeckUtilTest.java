package se.andolf.blackjack.util;

import org.junit.Test;
import se.andolf.blackjack.api.Card;
import se.andolf.blackjack.api.Rank;
import se.andolf.blackjack.api.Suit;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

/**
 * @author Thomas on 2017-03-04.
 */
public class DeckUtilTest {

    @Test
    public void shouldShuffleList(){
        final List<Card> controlDeck = new ArrayList<>();
        controlDeck.add(new Card(Rank.ACE, Suit.CLUBS));
        controlDeck.add(new Card(Rank.TWO, Suit.CLUBS));
        controlDeck.add(new Card(Rank.THREE, Suit.CLUBS));
        controlDeck.add(new Card(Rank.FOUR, Suit.CLUBS));

        final List<Card> deck = new ArrayList<>();
        deck.add(new Card(Rank.ACE, Suit.CLUBS));
        deck.add(new Card(Rank.TWO, Suit.CLUBS));
        deck.add(new Card(Rank.THREE, Suit.CLUBS));
        deck.add(new Card(Rank.FOUR, Suit.CLUBS));

        final List<Card> shuffledDeck = DeckUtil.shuffle(deck);

        assertNotEquals(shuffledDeck, controlDeck);

    }
}
