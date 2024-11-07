import java.util.Random;

public class Dado{

    private Random gerador = new Random();

    private int lados;
    private int valor;

    public Dado(){
        lados = 6;
        valor = 1;
    }

    public void rolar(){

        valor = gerador.nextInt(lados)+1;

    }

    public int getValor(){
        return valor;
    }

}