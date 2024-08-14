import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro(
                1995,
                "Monza",
                "Branco",
                "Chevrolet"
        );

        Carro carro2 = new Carro(
                2012,
                "206",
                "Vermelho",
                "Peugeot"
        );
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getIsentoIPVA());
        System.out.println(carro2.getMarca());


    }
}