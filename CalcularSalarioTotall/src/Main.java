import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declarando scanner

        //Entrada e processamento de dados
        System.out.println("Informe o valor de seu salário fixo");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Informe o valor total de vendas");
        double totalVendas = scanner.nextDouble();

        double salarioTotal;
        double comissao;

        // Verificação
        if (totalVendas <= 1500) {
            comissao = totalVendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((totalVendas - 1500) * 0.05);  // 3% até 1500 + 5% do que passar
        }

        salarioTotal = salarioFixo + comissao;

        System.out.printf("O salário total do vendedor é: R$ %.2f%n", salarioTotal);

        scanner.close();


    }
}