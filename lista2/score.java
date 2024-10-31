import java.util.Scanner;

public class score {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int qtd_invalidas = 0;
        boolean verify = true;
        float media = 0;
        float nota_anterior = 0;
        float nota_atual = 0;

        while(verify=true){

            nota_atual = sc.nextFloat();

            if(nota_atual<0 || nota_atual>10){
                qtd_invalidas = qtd_invalidas + 1;
            } else{
                if(nota_anterior==0){
                    nota_anterior = nota_atual;
                } else{
                    
                    verify = false;
                    break;
                }
            }
        }
        
        media = (nota_anterior+nota_atual)/2;

        for (int i=1; i<=qtd_invalidas; i++){
            System.out.println("nota invalida");
            if(i==qtd_invalidas){
                System.out.println("media = "+media);
            }
        }

    

    }
    
}
