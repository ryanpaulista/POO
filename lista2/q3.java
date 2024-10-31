import java.util.Scanner;

public class q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 1;
        while(contador<=1000){
            if(contador%13==2){
                System.out.println(contador);
            }

            contador++;
        }

    }

}