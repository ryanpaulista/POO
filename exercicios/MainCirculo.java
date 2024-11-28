import java.util.Random;
import java.util.Scanner;

public class MainCirculo{

    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        Circulo circulo = new Circulo();
        
        double raio = sc.nextDouble();
        System.out.println(raio);

        circulo.CalcularArea(raio);
        System.out.println(circulo.getArea());

    }

}