import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a==1){
            System.out.println("Domingo");
        } else if(a==2){
            System.out.println("Segunda");
        } else if(a==3){
            System.out.println("Terça");
        } else{
            System.out.println("Dia invalido");
        }

    }

}