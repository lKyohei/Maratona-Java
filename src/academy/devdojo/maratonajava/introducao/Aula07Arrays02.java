package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char '\u0000' == ' '
        // boolean false
        // String null
        //#############Interando arrays#######################

        String[] nomes = new String[3];
        nomes[0] = "Eduardo";
        nomes[1] = "Gabriel";
        nomes[2] = "Reis";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}

