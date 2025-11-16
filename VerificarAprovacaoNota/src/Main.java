import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declarando o scanner

        // Entrada e processamento de dados
        System.out.println("Informe a 1º nota do aluno");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a 2º nota do aluno");
        double nota2 = scanner.nextDouble();

        // Calcular média
        double media = (nota1 + nota2) / 2;

        // Verificação Média
        if (media >= 6.0) {
            System.out.println("Parabéns! Sua média é de: " + media + " pts e você foi APROVADO!");
        } else {
            System.out.println("Sua média é de " + media + " pts e você foi REPROVADO!");
        }
    }
}