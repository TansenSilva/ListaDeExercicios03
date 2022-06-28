package lista03A.exercicio03;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[2];
        System.out.print("Digite a primeira nota: ");
        notas[0] = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notas[1] = input.nextDouble();
        input.close();

        double media = (notas[0] + notas[1]) / 2;

        if (media >= 7 && media <10) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
    }
}
