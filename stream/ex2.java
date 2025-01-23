import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class ex2{

    public static void main(String[] args){

        List<String> palavras = Arrays.asList("cabelo", "mão", "pernas", "monitor", "dedo", "computador");
        palavras.stream()   
            .filter(palavra -> palavra.length() > 5)
            .map(palavra -> palavra.toUpperCase()) 
            .forEach(System.out::println);

    }

}