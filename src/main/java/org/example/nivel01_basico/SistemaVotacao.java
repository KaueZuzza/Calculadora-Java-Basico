package org.example.nivel01_basico;
import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidatoA = 0, candidatoB = 0;
        int voto = -1;

        while (voto != 0) {
            System.out.print("Vote 1 (A), 2 (B) ou 0 para encerrar: ");
            voto = sc.nextInt();
            if (voto == 1) candidatoA++;
            else if (voto == 2) candidatoB++;
        }
        System.out.println("Resultado -> A: " + candidatoA + " | B: " + candidatoB);
        sc.close();
    }
}