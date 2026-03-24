package org.example.nivel02_poo;

public class TestarAluno {
    public static void main(String[] args) {
        // Aqui você cria os objetos baseados no molde (Aluno)
        Aluno aluno1 = new Aluno("Kaue", 9.5);
        Aluno aluno2 = new Aluno("Joao", 5.0);

        aluno1.mostrarDados();
        System.out.println("--------------------");
        aluno2.mostrarDados();
    }
}