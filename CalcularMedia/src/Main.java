import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um scanner


        // Entrada e processamento de dados
        System.out.println("Informe a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = scanner.nextDouble();

        // Fórmula para calcular média
        double media = (nota1 + nota2) / 2;

        // Saída do resultado
        System.out.println("A média calculada entre as duas notas informadas é: " + media);



    }
}