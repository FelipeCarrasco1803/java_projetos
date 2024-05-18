import javax.swing.*;
import java.time.LocalDate;
import java.util.Locale;

public class Exercicio_05 {
    public static void main(String[] args) {

        // colocando e o ponto
        Locale.setDefault(Locale.US);
        LocalDate data = LocalDate.now();

        //declarando variaveis
        int ano_atual = LocalDate.now().getYear();
        int idade =0, ano = 0;

        //inserindo dados
        ano = (int) Double.parseDouble(JOptionPane.showInputDialog("ESCREVA O ANO EM QUE VC NASCEU: "));

        //calculando a idade
        idade = ano_atual - ano;



        //mostrando o resultado
        JOptionPane.showMessageDialog(null, "NA DATA DE " + data + " SUA IDADE É DE " + idade +" ANOS.");


    }
}
