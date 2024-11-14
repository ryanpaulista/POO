import java.util.Scanner;
import java.util.ArrayList;

public class Q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x;
        int num = sc.nextInt();

        ArrayList<Integer> valor = new ArrayList<>();

        for (int i = 0; i<num; i++){
            x = sc.nextInt();
            valor.add(x);
        }

        Integer[] valores = valor.toArray(new Integer[0]);
        
        for(int numero : valores){

            ArrayList<Integer> divs = new ArrayList<>();

            for (int j = 1; j<(numero/2); j++){
                if(numero%j==0){
                    divs.add(j);
                }
                if(j==((numero/2)-1)){
                    divs.add(numero/2);
                }
            }

            Integer[] divisores = divs.toArray(new Integer[0]);

            int tamanho = divisores.length;
            int soma = 0;

            for (int j = 0; j<tamanho; j++){
                soma = soma + divisores[j];
            }
            
            if(soma==numero){
                System.out.printf("%d eh perfeito \n", numero);
            } else{
                System.out.printf("%d nao eh perfeito \n", numero);
            }
            
            
        }

    }

}