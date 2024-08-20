import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro(2014, "Peugeot", "2008", "Peugeot");
        Carro carro2 = new Carro(2025, "Virtus", "Cinza Platinum", "Volkswagem");



        System.out.println(carro2.getModelo());
        System.out.println(carro2.getIsentoIPVA());
        System.out.println(carro2.getMarca());
    }
}