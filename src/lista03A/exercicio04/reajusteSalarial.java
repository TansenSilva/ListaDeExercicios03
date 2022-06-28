package lista03A.exercicio04;

import java.util.Scanner;

public class reajusteSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do salario: ");
        double salario = input.nextDouble();
        double reajuste = 0;
        double salarioReajustado = 0;
        int percentualReajuste = 0;

        if (salario<=280){
            reajuste = salario * 0.20;
            salarioReajustado = salario + reajuste;
            percentualReajuste = 20;

        } else if (salario > 280 && salario <= 700) {
            reajuste = salario * 0.15;
            salarioReajustado = salario + reajuste;
            percentualReajuste = 15;

        } else if (salario > 700 && salario <= 1500) {
            reajuste = salario * 0.1;
            salarioReajustado = salario + reajuste;
            percentualReajuste = 10;

        }else if (salario > 1500){
            reajuste = salario * 0.05;
            salarioReajustado = salario + reajuste;
            percentualReajuste = 5;

        }

        System.out.println("Valor do salário antes do reajuste: R$ "+ salario);
        System.out.println("Valor do persentual de aumento: " + percentualReajuste + "%");
        System.out.println("Valor do reajuste salarial: R$ " + reajuste);
        System.out.println("Valor do salario reajustado: R$ "+ salarioReajustado);

    }

}
