import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Entrada e processamento de dados
        System.out.println("Informe o preco atual do produto");
        double precoAtual = input.nextDouble();

        double desconto = precoAtual * 0.10;
        double precoAtualizado = precoAtual - desconto;

        // Saída
        System.out.println("O valor do desconto é: R$ " + desconto);
        System.out.println("O preço final com 10% de desconto é " +precoAtualizado);
    }
}