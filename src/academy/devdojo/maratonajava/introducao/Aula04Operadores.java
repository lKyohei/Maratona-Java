package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        float numero01 = 10f;
        float numero02 = 20f;
        System.out.println(numero02 - numero01);
        System.out.println(numero01 + numero02);
        System.out.println(numero01 * numero02);
        System.out.println(numero02 / numero01);

        // resto da divisao = %

        float resto = 21 % 7;
        System.out.println(resto);

        System.out.println("\n");

        //menor < // maior > // menor igual e maior igual <= >= igualdade == diferente !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVite = 10 != 20;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteVite "+isDezDiferenteVite);
        System.out.println("\n");

        //Operadores Logicos AND(&&) OR(||) NOT(!)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroLeiMaiorQueTrinta " +isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroLeiMaiorQueTrinta " +isDentroLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlaystation = 5000F;
        boolean isPLaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPLaystationCincoCompravel "+isPLaystationCincoCompravel);




    }
}
