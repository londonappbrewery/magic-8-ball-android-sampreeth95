package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView balldisplay=findViewById(R.id.image_eightball);
        final int[]  ballarray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        Button askbutton;
        askbutton=(Button)findViewById(R.id.ask_button);

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r =new Random();
                int number=r.nextInt(4);
                balldisplay.setImageResource(ballarray[number]);


            }
        });

    }
}
