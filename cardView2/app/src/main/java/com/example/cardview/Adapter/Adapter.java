package com.example.cardview.Adapter;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.Model.Post;
import com.example.cardview.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Post> lista;
    public Adapter (List<Post> lista){
        this.lista = lista;
    }
    public Adapter (){}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View lista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout, parent, false);
        return new MyViewHolder(lista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post post = lista.get(position);
        Drawable imagem = ContextCompat.getDrawable(holder.itemView.getContext(), post.getImagem());
        Drawable imagemUsuario = ContextCompat.getDrawable(holder.itemView.getContext(), post.getImagemUsuario());
        holder.usuario.setText(post.getUsuario());
        holder.descricao.setText(post.getDescricao());
        holder.imagem.setBackground(imagem);
        holder.imagemUsuario.setImageDrawable(imagemUsuario);
        holder.imageSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(post.isSave()){
                    post.setSave(false);
                    holder.imageSave.setImageResource(R.drawable.save);
                }
                else{
                    post.setSave(true);
                    holder.imageSave.setImageResource(R.drawable.saved);
                }
            }
        });

        holder.imageCurtida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (post.isLiked()) {
                    post.setLiked(false);
                    holder.imageCurtida.setImageResource(R.drawable.coracao);
                } else {
                    post.setLiked(true);
                    holder.imageCurtida.setImageResource(R.drawable.coracao_preenchido);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView usuario;
        TextView descricao;
        ImageView imagem;
        ImageView imageCurtida;
        ImageView imagemUsuario;
        ImageView imageSave;

        public MyViewHolder(View itemView){
            super(itemView);
            this.usuario = itemView.findViewById(R.id.usuario);
            this.descricao = itemView.findViewById(R.id.descricao);
            this.imagem = itemView.findViewById(R.id.imagem);
            this.imageCurtida = itemView.findViewById(R.id.coracao);
            this.imagemUsuario = itemView.findViewById(R.id.imageUsuario);
            this.imageSave = itemView.findViewById(R.id.imageSave);
        }

    }
}
