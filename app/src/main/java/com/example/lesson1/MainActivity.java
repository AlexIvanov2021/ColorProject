package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button red , green , blue;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        imageView = findViewById(R.id.image);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setBackgroundResource(R.color.red);

            }
        });

      blue.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              imageView.setBackgroundResource(R.color.blue);

          }
      });

    }
    public void setGreenColor(View view){
        imageView.setBackgroundResource(R.color.teal_200);

    }

}