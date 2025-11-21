import javax.swing.*;

public class Main {

    public static void main(String [] args) {
        String[] nomes = new String[5];


        // Entrada e processamento de dados
        nomes[0] = JOptionPane.showInputDialog(null, "Informe o nome da 1º pessoa");

        nomes[1] = JOptionPane.showInputDialog(null, "Informe o nome da 2º pessoa");

        nomes[2] = JOptionPane.showInputDialog(null, "Informe o nome da 3º pessoa");

        nomes[3] = JOptionPane.showInputDialog(null, "Informe o nome da 4º pessoa");

        nomes[4] = JOptionPane.showInputDialog(null, "Informe o nome da 5º pessoa");

        //Saída
        JOptionPane.showMessageDialog(null , "1º Pessoa: " + nomes[0]);

        JOptionPane.showMessageDialog(null , "2º Pessoa: " + nomes[1]);

        JOptionPane.showMessageDialog(null , "3º Pessoa: " + nomes[2]);

        JOptionPane.showMessageDialog(null , "4º Pessoa: " + nomes[3]);

        JOptionPane.showMessageDialog(null , "5º Pessoa: " + nomes[4]);
    }

}
