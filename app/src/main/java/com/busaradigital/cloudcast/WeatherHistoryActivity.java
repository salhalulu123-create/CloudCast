package com.busaradigital.cloudcast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        
        setContentView(R.layout.activity_weather_history);
        EdgeToEdge.enable(this);

        // Make the first history item clickable to navigate to WeatherDetailsActivity
        View historyItem = findViewById(R.id.cv_history_item);
        if (historyItem != null) {
            historyItem.setOnClickListener(v -> {
                Intent intent = new Intent(WeatherHistoryActivity.this, WeatherDetailsActivity.class);
                startActivity(intent);
            });
        }

        findViewById(R.id.btn_back).setOnClickListener(v -> finish());
    }
}