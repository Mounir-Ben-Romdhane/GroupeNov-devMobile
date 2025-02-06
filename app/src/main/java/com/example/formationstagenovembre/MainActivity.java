package com.example.formationstagenovembre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 1- Declaration des variables
    private ImageView imageShowHide;
    private Button btnShow, btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2- Affectation des views
        imageShowHide = findViewById(R.id.image_show_hide);
        btnShow = findViewById(R.id.btn_show);
        btnHide = findViewById(R.id.btn_hide);

        // 3- Actions
        btnShow.setOnClickListener(v -> {
            imageShowHide.setVisibility(View.VISIBLE);
        });

        btnHide.setOnClickListener(v -> {
            imageShowHide.setVisibility(View.INVISIBLE);
        });
    }
}