package edu.up.cs371.twigg20.pusoytester;

/**
 * Created by Jason on 2/25/2018.
 */

import java.util.ArrayList;

import edu.up.cs371.twigg20.pusoytester.Deck;

public class Deck {


    private int length;
    private Card currentCard;


    private ArrayList<Card> cards = new ArrayList<Card>();

    public void Deck(){



    }

    public void Deck( Deck oldDeck ){


    }

    public void fill(){




    }

    public int getLength(){

        return length;

    }

    public Card getCard( int cardPosition ) {
        return currentCard;
    }

}
