package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Hospede hospede; // Agregação
    private Quarto quarto;   // Agregação
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private boolean checkinFeito = false;
    private boolean checkoutFeito = false;

    public Reserva(Hospede hospede, Quarto quarto, LocalDate entrada, LocalDate saida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = entrada;
        this.dataSaida = saida;
    }

    public void realizarCheckin() {
        this.checkinFeito = true;
    }

    public void realizarCheckout() {
        this.checkoutFeito = true;
    }

    public boolean isCheckinFeito() {
        return checkinFeito;
    }

    public double gerarConta() {
        long dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        return dias * quarto.getPrecoPorNoite();
    }

    public Quarto getQuarto() {
        return this.quarto;
    }

    //override para o metodo toString do metodo generlizado de hotel 'listarColecao'
    @Override
    public String toString() {
        return "Reserva:\n" +
                "Hóspede: " + hospede.getNome() + "\n" +
                "Quarto nº " + quarto.getNumero() + "\n" +
                "Entrada: " + dataEntrada + "\n" +
                "Saída: " + dataSaida + "\n" +
                "Check-in feito? " + checkinFeito + "\n" +
                "Check-out feito? " + checkoutFeito;
    }

}
