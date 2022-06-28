package lista03B.exercicio01;

import java.util.Scanner;

public class contadorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero 1 (um) para iniciar o contador:");
        int numero = input.nextInt();
        input.close();

        for (numero = 1; numero<=100;numero++){
            System.out.println(numero);
        }

        System.out.println("Contador finalizado!");
    }
}
