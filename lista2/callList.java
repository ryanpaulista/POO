import java.util.Scanner;

public class callList {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        var array = new String[100];

        int qtd_alunos = sc.nextInt();
        int ganhador = sc.nextInt();

        for (int i = 0; i<qtd_alunos; i++){
            array[i] = sc.next();
        }
    
    }

}
