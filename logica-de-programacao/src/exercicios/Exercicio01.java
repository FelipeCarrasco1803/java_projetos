package exercicios;

public class Exercicio01 {

    public static void main(String[]args){
        double n1 = 1;
        double n2 = 1;
        double n3 = 1;
        double n4 = 1;

        String p1 = "PC";
        String p2 = "FONE";
        String p3 = "OPALA";
        String p4 = "CASA";

        double media;


        media = (n1+n2+n3+n4)/4;

        System.out.println("O PRODUTO "+ p1 + " CUSTA: "+n1);
        System.out.println("O PRODUTO "+ p2 + " CUSTA: "+n2);
        System.out.println("O PRODUTO "+ p3 + " CUSTA: "+n3);
        System.out.println("O PRODUTO "+ p4 + " CUSTA: "+n4);
        System.out.printf("média: %.2f%n",media);

        System.out.println("A MÉDIA DOS PRODUTOS É: "+media);

    }
}
