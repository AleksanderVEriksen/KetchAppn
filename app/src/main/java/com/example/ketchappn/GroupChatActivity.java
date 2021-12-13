package com.example.ketchappn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GroupChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String symbol = getIntent().getStringExtra("Symbol");
        String place = getIntent().getStringExtra("Place");
        String time = getIntent().getStringExtra("Time");

        TextView textViewSymbol = (TextView) findViewById(R.id.symbolChat);
        TextView textViewPlace = (TextView) findViewById(R.id.placeChat);
        TextView textViewTime = (TextView) findViewById(R.id.timeChat);
        Button button = (Button) findViewById(R.id.btnBack);


        textViewSymbol.setText(symbol);
        textViewPlace.setText(place);
        textViewTime.setText(time);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}