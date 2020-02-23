package com.example.culture_nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        Button button2_ = findViewById(R.id.button2_);
        button2_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FailActivity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = getPackageManager().getLaunchIntentForPackage("com.filipiknow.blueHacc");
                startActivity(i);
            }
        });
    }
}
