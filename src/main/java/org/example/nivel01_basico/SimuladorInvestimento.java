package org.example.nivel01_basico;

import java.util.Scanner;

public class SimuladorInvestimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE INVESTIMENTOS ===");

        System.out.print("Valor Inicial (R$): ");
        double capital = leitor.nextDouble();

        System.out.print("Taxa de Juros Mensal (%): ");
        double taxa = leitor.nextDouble() / 100; // Converte para decimal

        System.out.print("Tempo do Investimento (Meses): ");
        int meses = leitor.nextInt();

        System.out.println("\n--- Evolução do seu Dinheiro ---");

        for (int i = 1; i <= meses; i++) {
            double rendimentoMensal = capital * taxa;
            capital += rendimentoMensal; // Soma o juro ao capital (Juros Compostos)

            System.out.println("Mês " + i + ": R$ " + String.format("%.2f", capital));
        }

        System.out.println("\nResultado Final: R$ " + String.format("%.2f", capital));
        leitor.close();
    }
}