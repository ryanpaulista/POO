

public class Calculadora{

    private double valor;

    public Calculadora(){
        valor = 0.0;
    }

    public void somar(double v1){
        valor = valor + v1;
    }

    public void subtrair(double v1){
        valor = valor - v1;
    }

    public void multiplicar(double v1){
        valor = valor * v1;
    }

    public double dividir(double v1){
        if(v1!=0){
            valor = valor / v1;
            return valor;
        } else {
            return valor;
        }
            
    }

    public double getValor(){
        return valor;
    }
}