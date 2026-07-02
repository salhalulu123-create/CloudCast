package com.busaradigital.cloudcast;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        findViewById(R.id.tv_tab_history).setOnClickListener(v -> {
            startActivity(new Intent(this, WeatherHistoryActivity.class));
        });
    }
}