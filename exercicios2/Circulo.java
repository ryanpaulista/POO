public class Circulo{

    private double area, circunferencia;

    public Circulo(){
        area = 0;
        circunferencia = 0;
    }

    public void CalcularArea(double raio){
        area = area + (3.14*(raio*raio));
    }

    public void CalcularCircunferencia(double raio){
        circunferencia = circunferencia + (2*raio*raio);
    }

    public double getArea(){
        return area;
    }

    public double getCircunferencia(){
        return circunferencia;
    }

}