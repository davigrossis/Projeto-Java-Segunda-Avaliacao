package org.example;

public class Hospede extends Pessoa {
    private static int contadorHospedes = 0; //atributo estatico
    private int id;

    //construtor
    public Hospede(String nome, String documento) {
        super(nome, documento);
        this.id = ++contadorHospedes;
    }

    //metodos
    @Override
    public void exibirDetalhes() {
        System.out.println("Hóspede: " + nome + ", Documento: " + documento);
    }

    @Override
    public String getNome() {
        return nome;
    }

    //override para o metodo toString do metodo generlizado de hotel 'listarColecao'
    @Override
    public String toString() {
        return "Hóspede: " + nome + ", Documento: " + documento;
    }


}
