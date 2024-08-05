package com.example.RecyclerView.Adaptador;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.RecyclerView.R;
import com.example.RecyclerView.Model.Piloto;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Piloto> listaPilotos;

    public Adapter(List<Piloto> lista){
        this.listaPilotos = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View lista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout, parent, false);
        return new MyViewHolder(lista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Piloto piloto = listaPilotos.get(position);
        int color = Color.parseColor(piloto.getCor());
        String pontos = Integer.toString(piloto.getPontos());
        Drawable bandeira = ContextCompat.getDrawable(holder.itemView.getContext(), piloto.getBandeira());

        holder.textPiloto.setText(piloto.getPiloto());
        holder.textEquipe.setText(piloto.getEquipe());
        holder.textPontos.setText(pontos);
        holder.constraintLayout.setBackgroundColor(color);
        holder.bandeira.setBackground(bandeira);
    }

    @Override
    public int getItemCount() {
        return listaPilotos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textPiloto;
        TextView textEquipe;
        TextView textPontos;
        ConstraintLayout constraintLayout;
        ImageView bandeira;


        public MyViewHolder(View itemView){
            super(itemView);
            this.textPontos = itemView.findViewById(R.id.textPontos);
            this.textEquipe = itemView.findViewById(R.id.textEquipe);
            this.textPiloto = itemView.findViewById(R.id.textPiloto);
            this.constraintLayout = itemView.findViewById(R.id.teste);
            this.bandeira =  itemView.findViewById(R.id.bandeira);
        }
    }
}
