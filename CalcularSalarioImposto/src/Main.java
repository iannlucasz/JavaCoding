import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variáveis
        double salarioAtual , salarioAumento , salarioFinal;

        //Entrada e processamento de dados
        System.out.println("Informe o seu sálario:");
        salarioAtual = input.nextDouble();

        //Porcentagens
        salarioAumento = salarioAtual + (salarioAtual * 0.15);
        salarioFinal = salarioAumento - (salarioAumento * 0.08);

        //Saída
        System.out.printf("Seu salário atual é de: R$ %.2f%n",salarioFinal);

    }
}