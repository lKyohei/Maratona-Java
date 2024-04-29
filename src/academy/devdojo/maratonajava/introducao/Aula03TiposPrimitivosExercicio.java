package academy.devdojo.maratonajava.introducao;
/*
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de <salario>,na data
<data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "kirito";
        String endereco = "Av Joao das Galileias";
        double Salario = 5431.12;
        String dataRecebimento = "12/05/2024";

        String relatorio = "Eu " + nome + ",morando no endereço" + endereco + " confirmo que recebi o salario de " + Salario + ",na data " +
                dataRecebimento;

        System.out.println("Eu " + nome + ",morando no endereco " + endereco + ",confirmo que recebi" +
                "o salario de "+ Salario + ",nada data" + dataRecebimento);

        System.out.println(relatorio);


    }

}
