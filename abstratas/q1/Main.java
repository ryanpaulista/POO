public class Main{
    public static void main(String[] args){
        Cubo cubo1 = new Cubo();
        Esfera esfera1 = new Esfera();

        cubo1.CalcularVolume(3);
        esfera1.CalcularVolume(3);
        System.out.println("Volume do cubo: " + cubo1.GetVolume());
        System.out.println("Volume da esfera: " + esfera1.GetVolume());
    }
}