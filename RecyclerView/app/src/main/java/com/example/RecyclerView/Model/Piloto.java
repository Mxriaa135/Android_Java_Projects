package com.example.RecyclerView.Model;

public class Piloto {
    private String piloto;
    private String equipe;
    private int pontos;
    private String cor;
    private int bandeira;

    public Piloto(String piloto, String equipe, int pontos, String cor, int bandeira) {
        this.piloto = piloto;
        this.equipe = equipe;
        this.pontos = pontos;
        this.cor = cor;
        this.bandeira = bandeira;
    }

    public int getBandeira() {
        return bandeira;
    }

    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
