import java.util.Scanner;

public class MainDisciplina{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double bimestre1, bimestre2, provafinal; 
        String nomeDisciplina1;

        Disciplina disciplina1 = new Disciplina();

        System.out.print("Nome da disciplina: ");
        nomeDisciplina1 = sc.nextLine();
        System.out.print("Bimestre 1: ");
        bimestre1 = sc.nextDouble();
        System.out.print("Bimestre 2: ");
        bimestre2 = sc.nextDouble();

        disciplina1.CalcularMediaParcial(bimestre1, bimestre2);
        disciplina1.nomeDisciplina(nomeDisciplina1);
        double mediaparcial = disciplina1.getMediaParcial();

        System.out.println(disciplina1.getDisciplina()); 
        System.out.println(disciplina1.getMediaParcial());

        if (mediaparcial<60){
            System.out.print("O aluno ficou abaixo da média. Digite a nota da prova final: ");
            provafinal = sc.nextDouble(); 
            disciplina1.CalcularMediaFinal(mediaparcial, provafinal); 
            if(disciplina1.getMediaFinal()<60){
                System.out.print("Reprovou. Média final: ");
                System.out.println(disciplina1.getMediaFinal());  
            } else{
                System.out.print("Aprovado. Média final: ");
                System.out.println(disciplina1.getMediaFinal());  
            }
            
        }

    }


}