package com.example.jessica.dfgsdf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class levelPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelpage);

        Button toEasy=findViewById(R.id.easybutton);
        toEasy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levelPageActivity.this, ScoreActivity.class);
                startActivity(intent);
                //this does not send to first easy q! we used it to test ScoreActivity
            }
        });

        Button toInt=findViewById(R.id.intbutton);
        toInt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(levelPageActivity.this, toInt.class);
                startActivity(intent2);
            }
        });

        Button toHard=findViewById(R.id.hardbutton);
        toHard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent3 = new Intent(levelPageActivity.this, toHard.class);
                startActivity(intent3);
            }
        });

    }

}
