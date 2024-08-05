package com.example.RecyclerView.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.activity.EdgeToEdge;

import android.os.Bundle;

import com.example.RecyclerView.Adaptador.Adapter;
import com.example.RecyclerView.Model.Piloto;
import com.example.RecyclerView.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView lista;
    private List<Piloto> pilotos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        criarPilotos();
        ordenarLista();

        Adapter adapter = new Adapter(pilotos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        lista.setLayoutManager(layoutManager);
        lista.setHasFixedSize(true);
        lista.setAdapter(adapter);


    }

    public void criarPilotos(){
        Piloto piloto = new Piloto("Max Verstappen", "Red Bull Racing", 265, "#000080", R.drawable.holanda);
        this.pilotos.add(piloto);
        piloto = new Piloto("Sérgio Perez", "Red Bull Racing", 124, "#000080", R.drawable.mexico);
        this.pilotos.add(piloto);
        piloto = new Piloto("Lando Norris", "McLaren", 189, "#FF8C00", R.drawable.inglaterra);
        this.pilotos.add(piloto);
        piloto = new Piloto("Oscar Piastri", "McLaren", 149, "#FF8C00", R.drawable.australia);
        this.pilotos.add(piloto);
        piloto = new Piloto("Charles Leclerc", "Scuderia Ferrari", 162, "#E31010", R.drawable.monaco);
        this.pilotos.add(piloto);
        piloto = new Piloto("Carlos Sainz", "Scuderia Ferrari", 154, "#E31010", R.drawable.espanha);
        this.pilotos.add(piloto);
        piloto = new Piloto("Lewis Hamilton", "Mercedes AMG", 125, "#1C1C1C", R.drawable.inglaterra);
        this.pilotos.add(piloto);
        piloto = new Piloto("George Russel", "Mercedes AMG",116, "#1C1C1C", R.drawable.inglaterra);
        this.pilotos.add(piloto);
        piloto = new Piloto("Lance Stroll", "Aston Martin",24, "#009F7A", R.drawable.canada);
        this.pilotos.add(piloto);
        piloto = new Piloto("Fernando Alonso", "Aston Martin",45, "#009F7A", R.drawable.espanha);
        this.pilotos.add(piloto);
        piloto = new Piloto("Alex Albon", "Willians Racing",4, "#0000CD", R.drawable.tailandia);
        this.pilotos.add(piloto);
        piloto = new Piloto("Logan Sargent", "Willians Racing",0, "#0000CD", R.drawable.eua);
        this.pilotos.add(piloto);
        piloto = new Piloto("Kevin Magnussen", "Haas",5, "#8B0000", R.drawable.dinamarca);
        this.pilotos.add(piloto);
        piloto = new Piloto("Nico Hulkenberg", "Haas",22, "#8B0000", R.drawable.alemanha);
        this.pilotos.add(piloto);
        piloto = new Piloto("Daniel Ricciardo", "Racing Bulls",11, "#00008B", R.drawable.australia);
        this.pilotos.add(piloto);
        piloto = new Piloto("Yuki Tsunoda", "Racing Bulls", 22, "#00008B",  R.drawable.japao);
        this.pilotos.add(piloto);
        piloto = new Piloto("Valtteri Bottas", "Stake Team", 0, "#9E15D115",  R.drawable.finlandia);
        this.pilotos.add(piloto);
        piloto = new Piloto("Zhou Guanyo", "Stake Team", 0, "#9E15D115", R.drawable.china);
        this.pilotos.add(piloto);
        piloto = new Piloto("Pierre Gasly", "Alpine", 6, "#FF69B4", R.drawable.franca);
        this.pilotos.add(piloto);
        piloto = new Piloto("Esteban Ocon", "Alpine", 3, "#FF69B4", R.drawable.franca);
        this.pilotos.add(piloto);

    }
    public void ordenarLista(){
        Collections.sort(pilotos, new Comparator<Piloto>() {
            @Override
            public int compare(Piloto p1, Piloto p2) {
                return Integer.compare(p2.getPontos(), p1.getPontos());
            }
        });
    }
}
