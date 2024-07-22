package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Imprima o dia da semana, considerando 1 como domingo.
        System.out.println("Digite um número entre 1 e 6\n");
        byte dia = scanner.nextByte();
        //char,int,byte,short,enum,String -->variaveis que suporta no switch
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }
    }
}
