import java.util.Arrays;
import java.util.List; 
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

public class ex8{

    public static void main(String[] args){ 

        List<Integer> numeros = Arrays.asList(1, 2, 51, 10, 52, 60, 100); 

        double media = numeros.stream()
            .filter(n -> n>50)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);

        System.out.println(media);
        
    }

}