package lista03B.exercicio04;

import java.util.Scanner;

public class mediaNumerosInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros para a soma: ");
        int quantidadeNumeros = input.nextInt();

        int soma = 0;

        for (int i = 1;i <= quantidadeNumeros;i++){
            System.out.println("Digite o "+i+"° número");
            int numero = input.nextInt();

            if (numero > 0) {
                soma = soma + numero;
            }
        }

        System.out.println("A soma dos numeros inteiros positivos é: ");
    }
}
