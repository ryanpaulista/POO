public class Circulo{

    private double area;

    public Circulo(){
        area = 0;
    }

    public void CalcularArea(double raio){
        area = area + (3.14*(raio*raio));
    }

    public double getArea(){
        return area;
    }

}