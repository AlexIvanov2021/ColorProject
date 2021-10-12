package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button red , green , blue;
    ImageView imageView , pic;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text);
        pic = findViewById(R.id.pic);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setBackgroundResource(R.color.red);
                textView.setText("Красный");
                pic.setBackgroundResource(R.drawable.ic_baseline_add_ic_call_24);

            }
        });

      blue.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              imageView.setBackgroundResource(R.color.blue);
              textView.setText("Синий");
              pic.setBackgroundResource(R.drawable.ic_baseline_baby_changing_station_24);


          }
      });

    }
    public void setGreenColor(View view){
        imageView.setBackgroundResource(R.color.teal_200);
        textView.setText("Зелёный");
        pic.setBackgroundResource(R.drawable.ic_baseline_bedtime_24);

//sasha bobik
    }

}