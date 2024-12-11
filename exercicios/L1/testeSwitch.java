import java.util.Scanner;

public class testeSwitch {
    
    public static int diaNoMes(int mes){
        
        if (mes==4 || mes==6 || mes==9 || mes==11){
            return 30;
        }
        else if (mes==2){
            return 28;
        }
        else{
            return 31;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 e 12: ");
        int mes = sc.nextInt();
        int dias = diaNoMes(mes);
        System.out.printf("Dias: " + dias);
    }
}


