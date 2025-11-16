import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declarando o scanner

        // Entrada e processamento de dados
        System.out.println("Informe o 1º Número");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o 2º Número");
        double num2 = scanner.nextDouble();

        // Verificação
        if (num1 > num2) {
            System.out.println("O número 1 é o maior valor informado!");
        } else if (num2 > num1) {
            System.out.println("O número 2 é o maior valor informado!");
        } else {
            System.out.println("Ambos números informados possui o mesmo valor!");
        }

    }
}