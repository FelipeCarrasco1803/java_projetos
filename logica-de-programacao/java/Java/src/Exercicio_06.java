import java.util.Random;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String nome, curso, RA;
        byte idade;
        char genero;

        System.out.print("DIGITE SEU NOME PARA CADASTRO: ");
        nome = sc.nextLine();

        System.out.print("DIGITE SUA IDADE: ");
        idade = sc.nextByte();
        sc.nextLine(); // Consumindo a quebra de linha pendente

        System.out.print("DIGITE SEU GÊNERO: ");
        genero = sc.next().toUpperCase().charAt(0); // Lendo o primeiro caractere da entrada e convertendo para maiúsculas
        sc.nextLine(); // Consumindo a quebra de linha pendente

        System.out.print("DIGITE SEU CURSO: ");
        curso = sc.nextLine();

        // Gerando RA aleatório
        RA = nome.substring(0, 1) + rd.nextInt(100);

        System.out.println("NOME COMPLETO: " + nome.toUpperCase());
        System.out.println("QUANTIDADE DE CARACTERES NO NOME: " + nome.length());
        System.out.println("IDADE: " + idade);
        System.out.println("GÊNERO: " + genero);
        System.out.println("CURSO: " + curso.toLowerCase());
        System.out.println("RA: " + RA);

        sc.close();
    }
}
