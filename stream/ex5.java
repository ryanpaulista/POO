import java.util.Arrays;
import java.util.List; 
import java.util.stream.*;
import java.util.stream.Collectors;


public class ex5 {
	public static void main(String[] args) {
		
        IntStream.iterate(2, n -> n+2)
            .limit(10)
            .forEach(System.out::println);
        
	}
}
