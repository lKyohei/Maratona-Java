package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // while
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }
        //do while
        count = 0;
        do{
            System.out.println("Dentro do do-while " + count);
            count++;
        }while(count < 10);
        //for
        for(int i=0; i<10; i++){
            System.out.println("FOR " +i);
        }
    }

}
