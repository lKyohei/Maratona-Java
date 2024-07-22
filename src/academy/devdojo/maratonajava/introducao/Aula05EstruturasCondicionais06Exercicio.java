package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais06Exercicio {
    //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    //Considerando 1 como domingo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção Inválida");
                break;




        }
    }


}
