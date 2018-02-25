package com.example.jessica.dfgsdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;


public class ScoreActivity extends Activity {
    private int score = 2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorepage);
        showScoreMessage();
    }

    public void showScoreMessage(){
        TextView scoreZero = (TextView) findViewById(R.id.scorezero);
        TextView scoreOne = (TextView) findViewById(R.id.scoreone);
        TextView scoreTwo = (TextView) findViewById(R.id.scoretwo);
        TextView scoreThree = (TextView) findViewById(R.id.scorethree);
        TextView scoreFour = (TextView) findViewById(R.id.scorefour);
        TextView scoreFive = (TextView) findViewById(R.id.scorefive);
        switch(score){
            case 0: scoreZero.setVisibility(View.VISIBLE); break;
            case 1: scoreOne.setVisibility(View.VISIBLE); break;
            case 2: scoreTwo.setVisibility(View.VISIBLE); break;
            case 3: scoreThree.setVisibility(View.VISIBLE); break;
            case 4: scoreFour.setVisibility(View.VISIBLE); break;
            case 5: scoreFive.setVisibility(View.VISIBLE); break;
        }
    }
}
