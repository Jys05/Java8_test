package com.su.java8_test;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.su.java8_test.test.SortByRankThenSuit;
import com.su.java8_test.test.StandardDeck;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils utils = new Utils();
        Toast.makeText(this, utils.notRequired(), Toast.LENGTH_SHORT).show();

        StandardDeck myDeck = new StandardDeck();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            myDeck.getCards().forEach(card -> {
                        Log.e("=====>前", card.getRank() + "_" + card.getSuit());
                    }
            );
        }
        myDeck.shuffle();
        myDeck.sort(new SortByRankThenSuit());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            myDeck.getCards().forEach(card -> {
                        Log.e("=====>后", card.getRank() + "_" + card.getSuit());
                    }
            );
        }
    }


    前: DEUCE_DIAMONDS       ——————后: DEUCE_DIAMONDS
    前: THREE_DIAMONDS       ——————后: DEUCE_CLUBS
    前: FOUR_DIAMONDS       ——————后: DEUCE_HEARTS
    前: FIVE_DIAMONDS       ——————后: DEUCE_SPADES
    前: SIX_DIAMONDS       ——————后: THREE_DIAMONDS
    前: SEVEN_DIAMONDS       ——————后: THREE_CLUBS
    前: EIGHT_DIAMONDS       ——————后: THREE_HEARTS
    前: NINE_DIAMONDS       ——————后: THREE_SPADES
    前: TEN_DIAMONDS       ——————后: FOUR_DIAMONDS
    前: JACK_DIAMONDS       ——————后: FOUR_CLUBS
    前: QUEEN_DIAMONDS       ——————后: FOUR_HEARTS
    前: KING_DIAMONDS       ——————后: FOUR_SPADES
    前: ACE_DIAMONDS       ——————后: FIVE_DIAMONDS
    前: DEUCE_CLUBS       ——————后: FIVE_CLUBS
    前: THREE_CLUBS       ——————后: FIVE_HEARTS
    前: FOUR_CLUBS       ——————后: FIVE_SPADES
    前: FIVE_CLUBS       ——————后: SIX_DIAMONDS
    前: SIX_CLUBS       ——————后: SIX_CLUBS
    前: SEVEN_CLUBS       ——————后: SIX_HEARTS
    前: EIGHT_CLUBS       ——————后: SIX_SPADES
    前: NINE_CLUBS       ——————后: SEVEN_DIAMONDS
    前: TEN_CLUBS       ——————后: SEVEN_CLUBS
    前: JACK_CLUBS       ——————后: SEVEN_HEARTS
    前: QUEEN_CLUBS       ——————后: SEVEN_SPADES
    前: KING_CLUBS       ——————后: EIGHT_DIAMONDS
    前: ACE_CLUBS       ——————后: EIGHT_CLUBS
    前: DEUCE_HEARTS       ——————后: EIGHT_HEARTS
    前: THREE_HEARTS       ——————后: EIGHT_SPADES
    前: FOUR_HEARTS       ——————后: NINE_DIAMONDS
    前: FIVE_HEARTS       ——————后: NINE_CLUBS
    前: SIX_HEARTS       ——————后: NINE_HEARTS
    前: SEVEN_HEARTS       ——————后: NINE_SPADES
    前: EIGHT_HEARTS       ——————后: TEN_DIAMONDS
    前: NINE_HEARTS       ——————后: TEN_CLUBS
    前: TEN_HEARTS       ——————后: TEN_HEARTS
    前: JACK_HEARTS       ——————后: TEN_SPADES
    前: QUEEN_HEARTS       ——————后: JACK_DIAMONDS
    前: KING_HEARTS       ——————后: JACK_CLUBS
    前: ACE_HEARTS       ——————后: JACK_HEARTS
    前: DEUCE_SPADES       ——————后: JACK_SPADES
    前: THREE_SPADES       ——————后: QUEEN_DIAMONDS
    前: FOUR_SPADES       ——————后: QUEEN_CLUBS
    前: FIVE_SPADES       ——————后: QUEEN_HEARTS
    前: SIX_SPADES       ——————后: QUEEN_SPADES
    前: SEVEN_SPADES       ——————后: KING_DIAMONDS
    前: EIGHT_SPADES       ——————后: KING_CLUBS
    前: NINE_SPADES       ——————后: KING_HEARTS
    前: TEN_SPADES       ——————后: KING_SPADES
    前: JACK_SPADES       ——————后: ACE_DIAMONDS
    前: QUEEN_SPADES       ——————后: ACE_CLUBS
    前: KING_SPADES       ——————后: ACE_HEARTS
    前: ACE_SPADES       ——————后: ACE_SPADES
}
