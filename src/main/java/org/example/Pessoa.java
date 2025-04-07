package org.example;

//classe abstrata
public abstract class Pessoa implements Detalhes {

    //atributos
    protected String nome;
    protected String documento;

    //construtor
    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    //metodos abstratos que serão estendidos por hospede
    public abstract void exibirDetalhes();

    public abstract String getNome();
}
