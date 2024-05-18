import javax.swing.*;
import java.util.Locale;

import static javax.swing.JOptionPane.showMessageDialog;


public class Exercicio_04 {

    public static void main(String[]args){
        // colocando o scaner e o ponto
        Locale.setDefault(Locale.US);


        //declarando variaveis
        double dia = 0, km = 0, preco_dia = 0;
        ;

        //fazendo o calculo
        dia = Double.parseDouble(JOptionPane.showInputDialog("ESCREVA A QUANTIDADE DE DIAS QUE VC FICOU COM O CARRO "));
        km = Double.parseDouble(JOptionPane.showInputDialog("ESCREVA A QUANTIDADE DE KM RODADOS: "));


        //fazendo o cauculo
        preco_dia = Double.parseDouble(String.valueOf(dia * 86.75));
        double preco_km = Double.parseDouble(String.valueOf(km * 1.23));
        double preco = Double.parseDouble(String.valueOf(preco_dia + preco_km));




        //mostrando o resultado
        JOptionPane.showMessageDialog(null, "O PREÇO TOTAL É DE " + preco + " SENDO " + preco_dia + " COBRADOS POR CAUSA DOS DIAS, E " + preco_km + " POR CAUSA DA QUILOMETRAGEM.");
















    }
}
