package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;

    // classe hotel com coleções de lista
    private List<Hospede> hospedes = new ArrayList<>();
    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    //construtor
    public Hotel(String nome) {
        this.nome = nome;
    }

    //metodos
    public void adicionarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    // generalização
    public <T> void listarColecao(List<T> lista) {
        for (T item : lista) {
            System.out.println(item.toString());
        }
    }

    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.getQuarto().setReserva(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.getQuarto().cancelarReserva();
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

}
