package edu.up.cs371.twigg20.pusoytester;


import java.util.ArrayList;

/**
 * Created by Jason on 2/25/2018.
 */

public class PSState {

    ArrayList<Card> playerCards = new ArrayList<Card>();
    private Deck[] hands;

    //turn tracker
    private int toPlay;

    //initial constructor
    public void PSState(){

        hands = new Deck[5];
        hands[0] = new Deck();
        hands[1] = new Deck();
        hands[2] = new Deck();
        hands[3] = new Deck();
        hands[4] = new Deck();

        hands[0].fill();




    }

    //copy constructor
    public void PSState(PSState state, int player){

        hands = new Deck[5];

        hands[0] = new Deck( state.hands[0] );
        hands[1] = new Deck( state.hands[1] );
        hands[2] = new Deck( state.hands[2] );


    }



    @Override
    public String toString(){

        String gameState;
        gameState = "numCardsPlayer1= "+hands[0].getLength()+"\n"
                +"numCardsPlayer2= "+hands[1].getLength()+"\n"
                +"numCardsPlayer3= "+hands[2].getLength()+"\n\n"
                +"It is Player "+toPlay+"'s turn. \n";

        for( int i=0; i<hands[0].getLength(); i++ )
        {
            (hands[0].getCard(i)).toString();

        }

        return null;


    }




}
