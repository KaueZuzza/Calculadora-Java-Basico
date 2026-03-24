package org.example.nivel02_poo;

public class Aluno {
    // Atributos (O que o aluno TEM)
    String nome;
    double nota;

    // Construtor (Como o aluno nasce no sistema)
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Método (O que o aluno FAZ ou como ele se mostra)
    public void mostrarDados() {
        System.out.println("Nome: " + nome + " | Nota: " + nota);
        if (nota >= 7) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Recuperação.");
        }
    }
}