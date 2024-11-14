import java.util.Scanner;
import java.lang.StringBuilder;

public class Q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder strBuilder = new StringBuilder();

        int n = sc.nextInt(); 
        
        for (int i = 0; i<n;i++){
            String codificado = sc.next();
            String decodificado = "";

            int deslocamento = sc.nextInt();
            
            for(int j = 0; j<codificado.length(); j++){

                char carac = codificado.charAt(j);
                char caracDesloc = (char)(carac-deslocamento);
                int caracInt = caracDesloc;

                if (caracInt<65){
                    caracDesloc = (char)(caracDesloc+26);
                    System.out.print(caracDesloc);
                } else{
                    System.out.print(caracDesloc);
                }
                
            }

            System.out.println();



        }




    }

}