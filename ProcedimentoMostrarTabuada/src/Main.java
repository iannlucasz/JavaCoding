import java.util.Scanner;

public class Main {


    //Procedimento
    static void MostrarTabuada(int valorNum) {
        //Variável Local
        int multiplicar;

        for (int i = 1; i < 10; i++) {

            multiplicar = valorNum * i;
            System.out.println(valorNum + " x " + i + " = " + multiplicar);
        }
    }

    //Código principal
    public static void main (String[] args) {
        //Variável Local
        int num;

        Scanner input = new Scanner(System.in);

        //Entrada e processamento de dados
        System.out.print("Informe um número para saber a tabuada: ");
        num = input.nextInt();

        //Resultados
        MostrarTabuada(num);


    }

}
