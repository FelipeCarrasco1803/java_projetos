package Exercicios;

import javax.swing.*;

public class Exercicio_08 {
    public static void main(String[] args) {
        //declarando as variaveis
        double valor;
        String min = JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE MINUTOS UTILIZADOS: ");
        double imin = Double.parseDouble(min);

        if (imin > 100) {
            valor = (imin-100) * 2.30;
            String valorString = String.valueOf(valor);
            JOptionPane.showMessageDialog(null, "VALOR DA CONTA: " + valorString);
        }
        else{
            valor = 79.30;
        String valorString = String.valueOf(valor);
        JOptionPane.showMessageDialog(null, "VALOR DA CONTA: " + valorString);
        }
    }
}
