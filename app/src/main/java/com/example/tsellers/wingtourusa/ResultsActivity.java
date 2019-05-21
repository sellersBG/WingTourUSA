package com.example.tsellers.wingtourusa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent i = getIntent();
        Bundle b = i.getBundleExtra("results");

        String sauce = b.getString("sauce");
        String meat = b.getString("meat");
        String appearance = b.getString("appearance");
        String cook = b.getString("cook");
        String kick = b.getString("kick");
        double score = b.getDouble("score");
    }
}
