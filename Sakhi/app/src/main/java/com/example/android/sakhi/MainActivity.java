package com.example.android.sakhi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnConsolation;
    private Button btnAction;
    private Button btnEmergency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConsolation = findViewById(R.id.btn_consolation);
        btnAction = findViewById(R.id.btn_action);
        btnEmergency = findViewById(R.id.btn_emergency);

        btnConsolation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ConsolationActivity.class));
            }
        });

        btnAction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActionActivity.class));
            }
        });

        btnEmergency.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmergencyActivity.class));
            }
        });
    }
}
