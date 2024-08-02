package com.example.CaraOuCoroa;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {
    ImageView imageMoeda;
    ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        imageMoeda = findViewById(R.id.imageMoeda);
        botaoVoltar = findViewById(R.id.botaoVoltar);

        int numero = new Random().nextInt(2);
        String[] opcoes = {"Cara", "Coroa"};
        String opcoesApp = opcoes[numero];
        switch (opcoesApp){
            case "Cara":
                imageMoeda.setImageDrawable(getDrawable(R.drawable.moeda_cara));
            case "Coroa":
                imageMoeda.setBackground(getDrawable(R.drawable.moeda_coroa));

        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}