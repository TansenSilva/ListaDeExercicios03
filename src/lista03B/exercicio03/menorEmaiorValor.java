package lista03B.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menorEmaiorValor {
    public static void main(String[] args) {
        int quantidadeDeNumeros = 10;
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números ");

        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            System.out.print("Digite o " + i + "° número: ");
            Scanner input = new Scanner(System.in);
            numeros.add(input.nextInt());
        }

        int maiorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            } else if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("O menor número digitado foi: " + menorNumero);

    }
}
