package lista03B.exercicio02;

import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Você gostaria de calcular a mèdia de quantos números?");
        int quantidade = input.nextInt();
        System.out.println("Digite os numeros para o calculo da média entre eles: ");
        int numeros = input.nextInt();
        input.close();

        int total = numeros;
        double media = 0;

        for (int i=1;i<quantidade;i++){
            System.out.println("Digite o proximo número: ");
            numeros = input.nextInt();
            total = numeros+total;

        }
        media = total / quantidade;

        System.out.print("A média dos números digitados é: " + media);


    }
}
