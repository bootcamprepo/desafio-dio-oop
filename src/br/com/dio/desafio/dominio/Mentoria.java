package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    @Override
    public Double calcularXP() {
        return getXpPadrao() + 20D;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{"+ "Título " + getTitulo()
                +"Descrição:" + getDescricao() +
                "date=" + date +
                '}';
    }
}
