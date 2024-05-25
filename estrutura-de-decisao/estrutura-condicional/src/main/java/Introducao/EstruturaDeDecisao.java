package Introducao;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        //declarando as variaveis
        double n1,n2,n3, media;
        n1 = 8.5;
        n2 = 6;
        n3 = 2.4;


        //realizando a media
        media = (n1 + n2 + n3) / 3;


        //mostrando a media se esta aprovado ou não
        if (media >=7.0) {
            System.out.printf("SUA MÉDIA FOI %.1f E VOCE FOI APROVADO%n",media);
        }
        else if (media > 5.0 && media < 7.0) {
            System.out.printf("SUA MÉDIA FOI %.1f E VOCE ESTÁ DE RECUPERAÇÃO%n",media);
        }
        else {
            System.out.printf("SUA MÉDIA FOI %.1f E VOCE FOI REPROVADO\n",media);
        }
        System.out.println("OBRIGADO POR FAZER MÉDIA CONOSCO");

    }
}
