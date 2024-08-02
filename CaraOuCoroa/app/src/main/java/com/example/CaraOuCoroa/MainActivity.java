package com.example.CaraOuCoroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView botaoJogar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogar);
        botaoJogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(intent);
            }

        });

    }
}