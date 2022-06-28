package lista03B.exercicio01;


import java.util.Scanner;

public class contadorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero 1 (um) para iniciar o contador:");
        int numero = input.nextInt();
        input.close();

        while (numero <= 100){
            System.out.println(numero++);
        }

        System.out.println("Contador finalizado!");

    }

}
