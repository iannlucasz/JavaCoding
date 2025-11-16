import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Declarando scanner

        // Entrada e processamentos de dados
        System.out.println("Informe o seu nome");
        String nome = input.nextLine();

        System.out.println("Informe o número de sua conta bancária");
        double numeroConta = input.nextDouble();

        System.out.println("Informe o saldo de sua conta");
        double valorSaldo = input.nextDouble();

        System.out.println("Informe o valor do crédito de sua conta");
        double valorCredito = input.nextDouble();

        System.out.println("Informe o valor do débito de sua conta");
        double valorDebito = input.nextDouble();

        double saldoAtualizado = valorSaldo - valorDebito + valorCredito;

        // Verificação valor saldo
        if (saldoAtualizado >= 0) {
            System.out.println("==== Conta de "+ nome +" ====");
            System.out.println("Número da agência: " +numeroConta);
            System.out.println("Seu saldo é positivo!");
            System.out.println("Seu saldo é de R$" + saldoAtualizado);
        } else {
            System.out.println("==== Conta de "+ nome +" ====");
            System.out.println("Número da agência: " +numeroConta);
            System.out.println("Seu saldo é negativo!");
            System.out.println("Seu saldo é de R$" + saldoAtualizado);
        }


    }
}