package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.sexo = 'M';
        estudante.nome = "Eduardo Reis";
        estudante.idade = 22;

        System.out.println("Nome: " + estudante.nome);
        System.out.println("idade: " + estudante.idade);
        System.out.println("sexo: " + estudante.sexo);
    }
}
