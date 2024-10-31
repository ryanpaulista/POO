import java.util.Scanner;

public class ChristmasTree{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            int a = sc.nextInt();
            int line = 1;
            int qtd_asteriscos = 1;
            int qtd_espacos = (a-1)/2;

            while(qtd_asteriscos<a){

                StringBuilder linha = new StringBuilder();
            
                for (int i = 0; i<=qtd_espacos; i++){
                    linha.append(" ");
                    if(i==qtd_espacos){
                        linha.append("*")
                    }
                }
                
                line =
            }

        }
        

    }

}