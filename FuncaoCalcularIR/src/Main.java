import javax.swing.*;

public class Main {

    //Função para calcular imposto
    static double CalcularIR(double salario) {
        //Variável local
        double imposto;

        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.20;
        }
        return imposto;
    }

    //Código Principal
    public static void main(String[] args) {
        //Variável Global
        double salario;

        //Entrada e processamento de dados
        String salarioDigitado = JOptionPane.showInputDialog("Informe seu salário:");

        salario = Double.parseDouble(salarioDigitado);

        double imposto = CalcularIR(salario);
        double salarioLiquido = salario - imposto;

        JOptionPane.showMessageDialog(null,
                String.format("Seu salário após imposto é: R$ %.2f", salarioLiquido));



    }


}
