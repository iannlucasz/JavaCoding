import java.util.Scanner;

public class Main {

    static int dobro(int a) {
        return a * 2;
    }

    // Inicio do Algoritmo Principal
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor para descobrir o dobro: ");
        int num = input.nextInt();

        int resultado = dobro(num);

        System.out.println(resultado);

    }
}