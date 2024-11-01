import java.util.ArrayList;
import java.util.Scanner;


public class ChristmasTree{
    public static void main(String[] args) {
    
	    Scanner sc = new Scanner(System.in);
        int a = 0;
        ArrayList<Integer> valoresArray = new ArrayList<>();

       
        while(sc.hasNext()){

            a = sc.nextInt();
            valoresArray.add(a);

        }

        Integer[] valores = valoresArray.toArray(new Integer[0]);

        for(int numero : valores){
        
            int qtd_espacos = (numero-1)/2;

            for (int i = 1; i<=numero+1; i=i+2){
                
                StringBuilder linha = new StringBuilder();
                
                for (int j = 0; j<=qtd_espacos; j++){
                    
                    if(j==qtd_espacos){
                        for(int z = 1; z<=i; z++){
                            linha.append("*");
                        }
                    } else{
                        linha.append(" ");
                    }
                }

                String resultado = linha.toString();
                System.out.println(resultado);   
                qtd_espacos = qtd_espacos - 1;

                

                if(i==numero){
                    int meio = (numero+1)/2;
                    for(int m = 1; m<=meio;m++){
                        if (m==meio){
                            System.out.println("*");
                        } else{
                            System.out.print(" ");
                        }
                    }
                    
                    for(int m = 1; m<=meio-1; m++){
                        if(m==(meio-1)){
                            System.out.println("***");
                            System.out.println();
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            
            }

        }
    }
}