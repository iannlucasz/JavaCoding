


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        System.out.println("Informe seu nome:");
        String nome = input.nextLine();

        System.out.println("Informe a sua turma:");
        int turma = input.nextInt();

        System.out.println("Informe o valor da nota1:");
        double nota1 = input.nextDouble();

        System.out.println("Informe o valor da nota2:");
        double nota2 = input.nextDouble();

        System.out.println("Informe a porcentagem de frequência:");
        double freq = input.nextDouble();

        // Processamento
        double media = (nota1 + nota2) / 2;

        // Saída formatada
        System.out.println("\n==== Bem vindo ao Portal do Aluno (CEDAX) ====\n");
        System.out.println("Aluno: " + nome);
        System.out.println("Turma: " + turma);
        System.out.printf("Porcentagem total de frequência: %.2f%%%n", freq);
        System.out.printf("Média total: %.2f%n", media);

        if (media >= 7 && freq >= 75) {
            System.out.println("Situação final: APROVADO");
        } else {
            System.out.println("Situação final: REPROVADO");
        }

        System.out.println("\n==== Programa Encerrado ====");
        input.close();
    }
}
