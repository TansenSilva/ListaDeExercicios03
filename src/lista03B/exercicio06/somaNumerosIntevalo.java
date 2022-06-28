package lista03B.exercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class somaNumerosIntevalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

//        List <Integer> numerosImpar = new ArrayList<>();

        int soma = 0;

        if (segundoNumero<primeiroNumero){
            System.out.println("Intervalo de valores inválido");
        }
        else {

            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                if (i % 2 != 0) {

                    soma += i;
//                numerosImpar.add(i);
                }
            }

            System.out.println("Soma total dos números ímpar é: " + soma);

            //int total = numerosImpar.stream().mapToInt(Integer::intValue).sum();

//      System.out.println("Soma total dos números ímpar " + total);
        }
    }
}
