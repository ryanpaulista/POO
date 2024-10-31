import java.util.Scanner;

public class q4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 1;

        while(contador<=10){
            int mul = contador*n;
            System.out.println(contador + " x " + n + " = " + mul);
            contador++;
        }
    }
}