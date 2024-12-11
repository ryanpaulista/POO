public class Disciplina{

    private String disciplina;
    private double mediaparcial;
    private double mediafinal;

    public Disciplina(){ 
        this.disciplina = "";
        this.mediaparcial = 0;
        this.mediafinal = 0;
    }

    public void CalcularMediaParcial(double bimestre1, double bimestre2){
        this.mediaparcial =  ((bimestre1*2)+(bimestre2*3))/5;
    }

    
    public void CalcularMediaFinal(double mediaparcial, double provafinal){
        this.mediafinal = this.mediafinal + ((provafinal+mediaparcial)/2);
    }

    public double getMediaParcial(){
        return this.mediaparcial;
    }

    public double getMediaFinal(){
        return this.mediafinal; 

    }

}