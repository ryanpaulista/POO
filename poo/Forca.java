import java.nio.file.*;
import java.util.Random;

public class Forca{
    private int tentativasRestantes;
    private String palavra;
    private int tentativas;
    private char[] letras;

    private String escolherPalavra(){
        String[] linhas = 
            Files
            .readAllLines(Paths.get(palavras.txt));
            .toArray(new String[0]);
        return linhas[(new Random()).nextInt(linhas.lenght())];
    }

    public void iniciar(){
        this.palavra = escolherPalavra();
        this.tentativasRestantes = 6;
        this.letras = new char[26];
    }

    public void tentativa(char letra){
        if (palavra.contains(letra)){

        } else {
            this.tentativasRestantes -= 1;
        }
    }
}