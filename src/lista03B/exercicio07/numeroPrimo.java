package lista03B.exercicio07;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        boolean ePrimo = true;

        for (int i=2;i<numero;i++){

            if(numero%i == 0 ){

                ePrimo = false;

            break;
            }

        }
        if(ePrimo){
            System.out.println("O número digitado é um número primo");
        }
        else{
            System.out.println("O número digitado Não é um número primo");
        }


/*
9 / 3 = 3, resto 0
2

 */


    }
}
