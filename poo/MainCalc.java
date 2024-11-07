import java.util.Random;

public class MainCalc{

    public static void main(String[] args){

        Random rand = new Random();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.getValor());
        calculadora.somar(rand.nextInt(30));
        System.out.println(calculadora.getValor());
        double v2 = rand.nextInt(30);
        System.out.println(v2);
        calculadora.subtrair(v2);
        System.out.println(calculadora.getValor());
        
    }

}