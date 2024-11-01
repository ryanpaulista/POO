import java.util.Scanner;

public class gangorra{

    public static int equilibrio(int p1, int c1, int p2, int c2){

        int esquerda = p1 * c1;
        int direita = p2 * c2;

        if (esquerda==direita){
            return 0;
        } else if (esquerda>direita){
            return -1;
        } else {
            return 1;
        }


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        int resultado = equilibrio(p1, c1, p2, c2);

        System.out.println(resultado);

    }

}