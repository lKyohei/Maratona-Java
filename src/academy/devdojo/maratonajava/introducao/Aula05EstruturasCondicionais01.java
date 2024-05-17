package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !isAutorizadoComprarBebida

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não autorizado a comprar bebida!!!!!");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida.");
        }

        System.out.println("Fora do IF");
    }
}
