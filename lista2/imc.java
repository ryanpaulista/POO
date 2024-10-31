import java.util.Scanner;

public class imc {

    public static float calculoImc(float altura, float peso){
        float imc = peso/(altura*altura);
        return imc;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float altura = sc.nextFloat();
        float peso = sc.nextFloat();
        System.out.println(String.format("%.2f", calculoImc(altura, peso)));
    }

}
