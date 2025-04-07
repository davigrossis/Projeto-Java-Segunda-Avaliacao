package org.example;

public class Quarto implements Detalhes {
    //atributos
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private String descricaoDetalhada;
    private Reserva reserva;

    //construtor
    public Quarto(int numero, String tipo, double preco, String descricaoDetalhada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = preco;
        this.descricaoDetalhada = descricaoDetalhada;
    }

    //metodos
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void cancelarReserva() {
        this.reserva = null;
    }

    public boolean estaOcupado() {
        return reserva != null && reserva.isCheckinFeito();
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Quarto nº " + numero + " - Tipo: " + tipo + " - R$" + precoPorNoite + " por noite");
    }

    public String exibirQuarto() {
        return descricaoDetalhada;
    }

    //override para o metodo toString do metodo generlizado de hotel 'listarColecao'
    @Override
    public String toString() {
        return "Quarto nº " + numero + " - Tipo: " + tipo + " - R$" + precoPorNoite + " por noite"
                + "\nDescrição detalhada: " + descricaoDetalhada
                + "\nOcupado: " + estaOcupado();
    }

    public int getNumero() {
        return numero;
    }


}

