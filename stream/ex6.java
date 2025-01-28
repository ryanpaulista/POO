import java.util.Arrays;
import java.util.List; 
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

public class ex6{ 
	public static void main(String[] args) {
	    
	    Random random = new Random();
		
        IntStream numerosAleatorios = random.ints(10, 0, 1000);
        
        int maiorNumero =  numerosAleatorios
            .parallel()
            .max()
            .orElseThrow();
            
        System.out.println(maiorNumero);
           
	}
}
