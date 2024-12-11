import java.util.Scanner;

public class coffe{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        int caso1 = (p2*2)+(p3*4);
        int caso2 = (p1*2)+(p3*2);
        int caso3 = (p1*4)+(p2*2);

        if (caso1<=caso2 && caso1<=caso3){
            System.out.println(caso1);
        } else if(caso2<=caso1 && caso2<=caso3){
            System.out.println(caso2);
        } else{
            System.out.println(caso3);
        }

    }


}