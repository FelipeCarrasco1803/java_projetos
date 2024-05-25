package Exercicios;

import javax.swing.*;

public class Exercicio_10 {
    public static void main(String[] args) {
        String peso, altura;
        double imc;

        altura = JOptionPane.showInputDialog("DIGITE A ALTURA (em metros): ");
        double altura1 = Double.parseDouble(altura);

        peso = JOptionPane.showInputDialog("DIGITE O PESO (em kg): ");
        double peso1 = Double.parseDouble(peso);

        imc = peso1 / (altura1 * altura1);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI MAGREZA TOTAL. SEU IMC É DE: " + imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI PESO NORMAL. SEU IMC É DE: " + imc);
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI SOBREPESO. SEU IMC É DE: " + imc);
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI OBESIDADE GRAU I. SEU IMC É DE: " + imc);
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI OBESIDADE GRAU II (severa). SEU IMC É DE: " + imc);
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "SENHOR, VOCÊ POSSUI OBESIDADE GRAU III (mórbida). SEU IMC É DE: " + imc);
        } else {
            JOptionPane.showMessageDialog(null, "SENHOR, O VALOR DO IMC FORNECIDO É INVÁLIDO.");
        }
    }
}
