package com.example.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> deckOfCards = new ArrayList<String>();
    ArrayList<String> handOne = new ArrayList<String>();
    ArrayList<String> handTwo = new ArrayList<String>();

    private ImageView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;
    private TextView p1card1, p1card2, p1card3, p1card4, p1card5, p2card1, p2card2, p2card3, p2card4, p2card5;
    private Button dealButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dealButton = findViewById(R.id.dealButton);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        card7 = findViewById(R.id.card7);
        card8 = findViewById(R.id.card8);
        card9 = findViewById(R.id.card9);
        card10 = findViewById(R.id.card10);

        p1card1 = findViewById(R.id.p1card1);
        p1card2 = findViewById(R.id.p1card2);
        p1card3 = findViewById(R.id.p1card3);
        p1card4 = findViewById(R.id.p1card4);
        p1card5 = findViewById(R.id.p1card5);
        p2card1 = findViewById(R.id.p2card1);
        p2card2 = findViewById(R.id.p2card2);
        p2card3 = findViewById(R.id.p2card3);
        p2card4 = findViewById(R.id.p2card4);
        p2card5 = findViewById(R.id.p2card5);

        dealButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dealCards();
            }
        });

        createDeck();
        shuffleDeck();
    }


    public ArrayList<String> dealHand() {

        if (handOne.size() > 0) {
            handOne.remove(0);
            handOne.remove(0);
            handOne.remove(0);
            handOne.remove(0);
            handOne.remove(0);
        }
        for (int i=0; i < 5; i++) {
            handOne.add(deckOfCards.get(0));
            deckOfCards.remove(0);
        }

        if (handTwo.size() > 0) {
            handTwo.remove(0);
            handTwo.remove(0);
            handTwo.remove(0);
            handTwo.remove(0);
            handTwo.remove(0);
        }
        for (int i=0; i < 5; i++) {
            handTwo.add(deckOfCards.get(0));
            deckOfCards.remove(0);
        }
        return handTwo;
    }
    public void createDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for (int i = 0; i < ranks.length; i++) {
            for (int x = 0; x < suits.length; x++) {
                String card2 = ranks[i] + " of " + suits[x];
                deckOfCards.add(card2);
            }
        }
    }

    public void dealCards(){
        shuffleDeck();
        dealHand();

        p1card1.setText(handOne.get(0));
        p1card2.setText(handOne.get(1));
        p1card3.setText(handOne.get(2));
        p1card4.setText(handOne.get(3));
        p1card5.setText(handOne.get(4));

        p2card1.setText(handTwo.get(0));
        p2card2.setText(handTwo.get(1));
        p2card3.setText(handTwo.get(2));
        p2card4.setText(handTwo.get(3));
        p2card5.setText(handTwo.get(4));

        String card1a = handOne.get(0);
        String card1b = card1a.replaceAll(" ","");
        String card01 = card1b.toLowerCase();

        String card2a = handOne.get(1);
        String card2b = card2a.replaceAll(" ","");
        String card02 = card2b.toLowerCase();

        String card3a = handOne.get(2);
        String card3b = card3a.replaceAll(" ","");
        String card03 = card3b.toLowerCase();

        String card4a = handOne.get(3);
        String card4b = card4a.replaceAll(" ","");
        String card04 = card4b.toLowerCase();

        String card5a = handOne.get(4);
        String card5b = card5a.replaceAll(" ","");
        String card05 = card5b.toLowerCase();

        String card6a = handTwo.get(0);
        String card6b = card6a.replaceAll(" ","");
        String card06 = card6b.toLowerCase();

        String card7a = handTwo.get(1);
        String card7b = card7a.replaceAll(" ","");
        String card07 = card7b.toLowerCase();

        String card8a = handTwo.get(2);
        String card8b = card8a.replaceAll(" ","");
        String card08 = card8b.toLowerCase();

        String card9a = handTwo.get(3);
        String card9b = card9a.replaceAll(" ","");
        String card09 = card9b.toLowerCase();

        String card10a = handTwo.get(4);
        String card10b = card10a.replaceAll(" ","");
        String card010 = card10b.toLowerCase();


        int resultCard01 = getResources().getIdentifier(card01, "drawable", "com.example.poker");
        int resultCard02 = getResources().getIdentifier(card02, "drawable", "com.example.poker");
        int resultCard03 = getResources().getIdentifier(card03, "drawable", "com.example.poker");
        int resultCard04 = getResources().getIdentifier(card04, "drawable", "com.example.poker");
        int resultCard05 = getResources().getIdentifier(card05, "drawable", "com.example.poker");
        int resultCard06 = getResources().getIdentifier(card06, "drawable", "com.example.poker");
        int resultCard07 = getResources().getIdentifier(card07, "drawable", "com.example.poker");
        int resultCard08 = getResources().getIdentifier(card08, "drawable", "com.example.poker");
        int resultCard09 = getResources().getIdentifier(card09, "drawable", "com.example.poker");
        int resultCard10 = getResources().getIdentifier(card010, "drawable", "com.example.poker");


        card1.setImageResource(resultCard01);
        card2.setImageResource(resultCard02);
        card3.setImageResource(resultCard03);
        card4.setImageResource(resultCard04);
        card5.setImageResource(resultCard05);
        card6.setImageResource(resultCard06);
        card7.setImageResource(resultCard07);
        card8.setImageResource(resultCard08);
        card9.setImageResource(resultCard09);
        card10.setImageResource(resultCard10);

    }
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }
}
