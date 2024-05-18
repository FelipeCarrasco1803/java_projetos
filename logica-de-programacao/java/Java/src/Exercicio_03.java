import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[]args){
        // colocando o scaner e o ponto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //declarando as variaveis
        double temperatura, kelvin, fahrenheit, reaumur, rankine;


        //passando os valores
        temperatura = Double.parseDouble(JOptionPane.showInputDialog("ESCREVA A TEMPERATURA EM CELCIUS: "));
        kelvin = temperatura + 273.15;
        fahrenheit = (temperatura * 9 / 5) + 32;
        reaumur = temperatura * 4 / 5;
        rankine = (temperatura + 273.15) * 9 / 5;


        //mostrando os valores
        System.out.printf("A TEMPERATURA %.2f, CONVERTIDO PARA kelvin É %.2f %n",temperatura,kelvin);
        System.out.printf("A TEMPERATURA %.2f, CONVERTIDO PARA fahrenheit É %.2f %n",temperatura,fahrenheit);
        System.out.printf("A TEMPERATURA %.2f, CONVERTIDO PARA reaumur É %.2f %n",temperatura,reaumur);
        System.out.printf("A TEMPERATURA %.2f, CONVERTIDO PARA rankine É %.2f %n",temperatura,rankine);
        sc.close();
    }
}
