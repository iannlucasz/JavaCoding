import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variáveis
        int a , b , c;

        // Entrada e processamento de dados
        System.out.println("Informe o valor A:");
        a = input.nextInt();

        System.out.println("Informe o valor B:");
        b = input.nextInt();

        if (a != b) {
            c = a * b;
            System.out.println("O valor de C é: " + c);
        } else {
            c = a + b;
            System.out.println("O valor de C é: " + c);
        }

        input.close();

    }
}