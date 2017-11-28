package com.example.dannyang27.bitcoinvalue.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dannyang27.bitcoinvalue.R;

public class MainActivity extends AppCompatActivity {

    Button bbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbutton = (Button) findViewById(R.id.bbutton);

        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), TabbedActivity.class);
                startActivity(i);
            }
        });
    }
}
