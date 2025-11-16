import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variáveis
        double precoLitro;
        double valorPago;
        double litros;

        //Entrada e processamento de valores
        System.out.println("Informe o preço atual do litro da gasolina (R$): ");
        precoLitro = input.nextDouble();

        System.out.println("Informe o valor que deseja colocar de gasolina (R$): ");
        valorPago = input.nextDouble();

        litros = valorPago / precoLitro; // Fórmula para calcular quantidade de litros

        //Saída
        System.out.printf("Com R$ %.2f de gasolina você consegue colocar %.2f de gasolina.%n", valorPago , litros);

        input.close();


    }
}