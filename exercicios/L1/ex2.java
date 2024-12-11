import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero do mes: ");
        int mes = sc.nextInt();

        if (mes==1){
            System.out.print("January");
        } else if (mes==2){
            System.out.print("February");
        } else if (mes==3){
            System.out.print("March");
        } else if (mes==4){
            System.out.print("April");
        } else if (mes==5){
            System.out.print("May");
        } else if (mes==6){
            System.out.print("June");
        } else if (mes==7){
            System.out.print("July");
        } else if (mes==8){
            System.out.print("August");
        } else if (mes==9){
            System.out.print("September");
        } else if (mes==10){
            System.out.print("October");
        } else if (mes==11){
            System.out.print("November");
        } else if (mes==12){
            System.out.print("December");
        }
        
    }
}
