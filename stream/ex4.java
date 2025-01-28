import java.util.Arrays;
import java.util.List; 
import java.util.stream.*;
import java.util.stream.Collectors;


public class ex4 {
	public static void main(String[] args) {
		
        List<String> palavras = Arrays.asList("mão", "pés", "chão", "monitor");
        String result = palavras.stream()
            .collect(Collectors.joining(","));
            
        System.out.println(result);
		
	}
}
