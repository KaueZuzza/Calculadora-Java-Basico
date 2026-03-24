package org.example;

import java.util.Scanner;

public class CalculadoraCompleta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== BEM-VINDO À CALCULADORA JAVA ===");

        while (continuar) {
            System.out.println("\nEscolha a operação:");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            int opcao = leitor.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Encerrando calculadora... Até logo!");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double n1 = leitor.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = leitor.nextDouble();

            // O Switch Case é perfeito para menus
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + somar(n1, n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(n1, n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + dividir(n1, n2));
                    } else {
                        System.out.println("Erro: Não existe divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }

    // --- Nossos Métodos (As ferramentas da calculadora) ---

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}