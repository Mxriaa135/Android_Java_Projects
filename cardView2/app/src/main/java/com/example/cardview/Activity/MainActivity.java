package com.example.cardview.Activity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.Adapter.Adapter;
import com.example.cardview.Model.Post;
import com.example.cardview.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lista;
    private List<Post> listaPosts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        criarPosts();

        lista = findViewById(R.id.lista);
        Adapter adapter = new Adapter(listaPosts);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        lista.setLayoutManager(layoutManager);
        lista.setHasFixedSize(true);
        lista.setAdapter(adapter);



    }

    public void criarPosts(){
        Post post = new Post("f1", "The dispute for p10", R.drawable.f1, R.drawable.f1usuario);
        listaPosts.add(post);
        post = new Post("redbullracing", "Today in Spa!", R.drawable.redbull, R.drawable.rbr);
        listaPosts.add(post);
        post = new Post("mclaren", "A amazing Day!", R.drawable.mclaren,R.drawable.mclarenusuario);
        listaPosts.add(post);
        post = new Post("landonorris", "It wasn`t a good quali, but i`ll do my best tomorrow. See you!", R.drawable.lando, R.drawable.landousuario);
        listaPosts.add(post);

    }
}