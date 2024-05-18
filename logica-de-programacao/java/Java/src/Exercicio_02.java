import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Exercicio_02 {

    public static void main(String[]args){
        // colocando o scaner e o ponto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        // declarando as variaveis
        double  raio, area;
        final double pi = 3.14;

        //passando os valores

        System.out.print("DIGITE O RAIO DO CIRCULO: ");
        raio = sc.nextDouble();

        //fazendo o cauculo
        area = pi * (raio* raio);

        //imprimindo o resultado
        System.out.printf("O RESULTADO DA ÁREA É: %.2f",area);



        sc.close();
    }
}
