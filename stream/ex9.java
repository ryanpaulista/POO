import java.util.*;
import java.util.List; 
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

public class ex9{

    public static void main(String[] args){

        List<String> palavras = Arrays.asList("Mão", "Televisão", "Monitor", "Corpo");

        Map<Integer, List<String>> palavrasOrganizadas = palavras.stream()
            .collect(Collectors.groupingBy(String::length));

        System.out.println(palavrasOrganizadas);

    }


}