package com.example.cardview.Model;

public class Post {
    private String usuario;
    private String descricao;
    private int imagemUsuario;
    private int imagem;
    private boolean isLiked;
    private boolean isSave;

    public Post(String usuario, String descricao, int imagem, int imagemUsuario) {
        this.usuario = usuario;
        this.descricao = descricao;
        this.imagem = imagem;
        this.isLiked = false;
        this.isSave = false;
        this.imagemUsuario = imagemUsuario;
    }

    public boolean isSave() {
        return isSave;
    }

    public void setSave(boolean save) {
        isSave = save;
    }

    public int getImagemUsuario() {
        return imagemUsuario;
    }

    public void setImagemUsuario(int imagemUsuario) {
        this.imagemUsuario = imagemUsuario;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
