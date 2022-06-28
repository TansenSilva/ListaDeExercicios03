package lista03B.exercicio09;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int total = 1;

        for (int i=1;i<=numero;i++){
            System.out.print(total + "x" + i + "=" );
            total *=i;
            System.out.println(total);

        }

        System.out.println("O fatorial do numero digitado é: "+ total);
    }
}
