package lista03A.exercicio02;

import java.util.Scanner;

public class precoProduto {
    public static void main(String[] args) {
        Scanner precoProduto = new Scanner(System.in);
        Scanner nomeProduto = new Scanner(System.in);
        System.out.print("Digite o nome do produto 01: ");
        String produto01 = precoProduto.next();
        System.out.print("Digite o preço do produto 01: ");
        double preco01 = precoProduto.nextDouble();
        System.out.print("Digite o nome do produto 02: ");
        String produto02 = precoProduto.next();
        System.out.print("Digite o preço do produto 02: ");
        double preco02 = precoProduto.nextDouble();
        System.out.print("Digite o nome do produto 03: ");
        String produto03 = precoProduto.next();
        System.out.print("Digite o preço do produto 03: ");
        double preco03 = precoProduto.nextDouble();

        precoProduto.close();
        nomeProduto.close();

        if (preco01<preco02 && preco01<preco03){
            System.out.println("Compre o(a) "+produto01+ " é o produto mais barato");
        } else if (preco02<preco01 && preco02<preco03) {
            System.out.println("Compre o(a) "+produto02+ " é o produto mais barato");
        }else if (preco03<preco01 && preco03<preco02) {
            System.out.println("Compre o(a) "+produto03+ " é o produto mais barato");
        }else if (preco03==preco01 && preco03>preco02) {
            System.out.println("Compre o(a) " + produto02 + " é o produto mais barato");
        }else if (preco02==preco01 && preco03<preco02) {
            System.out.println("Compre o(a) " + produto03 + " é o produto mais barato");
        }else if (preco02==preco03 && preco03>preco01) {
            System.out.println("Compre o(a) " + produto01 + " é o produto mais barato");
        }
    }
}
