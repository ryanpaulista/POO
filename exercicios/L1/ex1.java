import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o DDD: ");
        int ddd = sc.nextInt();

        if (ddd==61){
            System.out.print("Brasilia");
        } else if (ddd==71){
            System.out.print("Salvador");
        } else if (ddd==11){
            System.out.print("Sao Paulo");
        } else if (ddd==21){
            System.out.print("Rio de Janeiro");
        } else if (ddd==32){
            System.out.print("Juiz de Fora");
        } else if (ddd==19){
            System.out.print("Campinas");
        } else if (ddd==27){
            System.out.print("Vitoria");
        } else if (ddd==31){
            System.out.print("Belo Horizonte");
        }
        
    }


}