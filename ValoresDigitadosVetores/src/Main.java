import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[6];

        // Entrada
        for (int i = 0; i < 6; i++) {
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número:")
            );
        }

        // Saída
        for (int i = 0; i < 6; i++) {
            JOptionPane.showMessageDialog(
                    null,
                    "O " + (i + 1) + "º número digitado foi: " + numeros[i]
            );
        }
    }
}
