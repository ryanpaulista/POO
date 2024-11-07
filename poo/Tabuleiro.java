public class Tabuleiro{
    public static void main(String[] args){
        Dado dado = new Dado();
        System.out.println(dado.getValor());
        dado.rolar();
        System.out.println(dado.getValor());
    }
}