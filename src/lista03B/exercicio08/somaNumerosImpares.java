package lista03B.exercicio08;

import java.util.Scanner;

public class somaNumerosImpares {
    public static void main(String[] args) {
        int numero = 100;
        int soma = 0;

        for (int i = 0;i<100;i++){
            if (i % 2 != 0){
                soma += i;
            }

        }
        System.out.println("Soma total dos números ímpares de 1 a 100 é: " + soma);

    }
}
