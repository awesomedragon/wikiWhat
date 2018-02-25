package com.example.jessica.dfgsdf;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TextView;
//^stuff u need

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tolevelPage = findViewById(R.id.play_button);
        tolevelPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, levelPageActivity.class);
                startActivity(intent);
        }
        });
    }


}

