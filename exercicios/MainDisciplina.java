import java.util.Scanner;

public class MainDisciplina{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double bimestre1, bimestre2, provafinal; 

        Disciplina disciplina1 = new Disciplina();

        bimestre1 = sc.nextDouble();
        bimestre2 = sc.nextDouble();

        disciplina1.CalcularMediaParcial(bimestre1, bimestre2);
        double mediaparcial = disciplina1.getMediaParcial();
        System.out.println(disciplina1.getMediaParcial());
        if (mediaparcial<60){
            provafinal = sc.nextDouble(); 
            disciplina1.CalcularMediaFinal(mediaparcial, provafinal); 
            System.out.println(disciplina1.getMediaFinal());  
        }

    }


}