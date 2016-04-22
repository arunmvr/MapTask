package com.example.arun.maptask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clocation, bangalore, chennai;
        clocation = (Button) findViewById(R.id.clocation);
        bangalore = (Button) findViewById(R.id.bangalore);
        chennai = (Button) findViewById(R.id.chennai);

        clocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("Choice", 0);
                startActivity(intent);

            }
        });

        bangalore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("Choice", 1);
                startActivity(intent);

            }
        });

        chennai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("Choice", 2);
                startActivity(intent);

            }
        });

    }
}
