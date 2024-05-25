package Exercicios;

import javax.swing.*;

public class Exercicio_09 {
    public static void main(String[] args) {
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NÚMERO DO DIA DA SEMANA (1 para Domingo, 2 para Segunda-feira, etc.): "));

            switch (dia) {
                case 1:
                    JOptionPane.showMessageDialog(null, "HOJE É DOMINGO");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "HOJE É SEGUNDA-FEIRA");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "HOJE É TERÇA-FEIRA");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "HOJE É QUARTA-FEIRA");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "HOJE É QUINTA-FEIRA");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "HOJE É SEXTA-FEIRA");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "HOJE É SÁBADO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Dia inválido");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao processar o dia. Certifique-se de inserir um valor válido.");
        }
    }
}
