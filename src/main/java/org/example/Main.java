package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando o hotel
        Hotel hotel = new Hotel("Hotel Paraíso");

        // criando hóspedes
        Hospede hospede1 = new Hospede("João Silva", "123456789");
        Hospede hospede2 = new Hospede("Ana Souza", "987654321");

        // adicionando hóspedes ao hotel
        hotel.adicionarHospede(hospede1);
        hotel.adicionarHospede(hospede2);

        // criando quartos
        Quarto quarto1 = new Quarto(101, "Luxo", 200.0, "2 quartos, 1 banheiro, vista para o mar");
        Quarto quarto2 = new Quarto(102, "Simples", 100.0, "1 quarto, 1 banheiro");

        // adicionando quartos ao hotel
        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);

        // criando reserva
        Reserva reserva1 = new Reserva(hospede1, quarto1, LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 15));

        // registrando uma reserva
        hotel.registrarReserva(reserva1);

        // exibindo detalhes do hóspede e do quarto
        hospede1.exibirDetalhes();
        quarto1.exibirDetalhes();
        System.out.println("Descrição detalhada do quarto: " + quarto1.exibirQuarto());

        // realizando um checkin
        reserva1.realizarCheckin();
        System.out.println("Quarto ocupado? " + quarto1.estaOcupado());

        // gerando conta com e sem desconto usando a classe Fatura (sobrecarga)
        double total = reserva1.gerarConta();
        System.out.println("Total sem desconto: R$" + Fatura.calcularConta(quarto1.getPrecoPorNoite(), 5));
        System.out.println("Total com desconto: R$" + Fatura.calcularConta(quarto1.getPrecoPorNoite(), 5, 50.0));

        // realizando checkout
        reserva1.realizarCheckout();

        // cancelamento da reserva
        hotel.cancelarReserva(reserva1);
        System.out.println("Quarto ocupado após checkout e cancelamento? " + quarto1.estaOcupado());

        // exibir listas com métodos genéricos
        System.out.println("\n--- Hóspedes ---");
        hotel.listarColecao(new ArrayList<>(hotel.getHospedes()));

        System.out.println("\n--- Quartos ---");
        hotel.listarColecao(new ArrayList<>(hotel.getQuartos()));

        System.out.println("\n--- Reservas ---");
        hotel.listarColecao(new ArrayList<>(hotel.getReservas()));
    }
}
