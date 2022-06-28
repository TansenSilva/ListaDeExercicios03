package lista03A.exercicio01;

import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número : ");
        double numero1 = numero.nextInt();
        System.out.print("Digite outro numero : ");
        double numero2 = numero.nextInt();

        numero.close();

        if (numero2 == numero1){
            System.out.print("Você digitou dois números iguais, rode novamente o algoritimo e não repita o número.");;
        }
        else if(numero1 > numero2){
            System.out.println("O primeiro número digitado é o maior número.");
        }else{
            System.out.println("O segundo número digitado é o maior número.");
        }
    }
}
