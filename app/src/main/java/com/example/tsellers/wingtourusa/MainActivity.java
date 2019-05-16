package com.example.tsellers.wingtourusa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText sauce, meat, appearance, cook, kick;
    Button calculate;
    double score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sauce  = findViewById(R.id.sauceText);
        meat = findViewById(R.id.meatText);
        appearance = findViewById(R.id.appearanceText);
        cook = findViewById(R.id.cookText);
        kick = findViewById(R.id.kickText);
        calculate = findViewById(R.id.button);

        score = (Double.parseDouble(sauce.getText().toString()) + Double.parseDouble(meat.getText().toString())
            + Double.parseDouble(appearance.getText().toString()) + Double.parseDouble(cook.getText().toString())
            + Double.parseDouble(kick.getText().toString()))/5;

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ResultsActivity.class);
            }
        });
    }
}
