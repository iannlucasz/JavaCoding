import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Entrada e processamentos de dados
        System.out.print("Informe a quantidade de cavalos comprado: ");
        int qtdCavalos = input.nextInt();

        //Fórmula para calcular quantidade de ferraduras
        int totalFerraduras = qtdCavalos * 4;// 1 para cada pata

        //Saída
        System.out.println("Será necessário comprar: " + totalFerraduras + " ferraduras.");

        input.close();

    }
}