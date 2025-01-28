import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex7 {

    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return this.nome;
        }

        public int getIdade() {
            return this.idade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Idade: " + idade;
        }
    }

    public static void main(String[] args) {
    
        List<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("João", 25));
        listaDePessoas.add(new Pessoa("Ana", 17));
        listaDePessoas.add(new Pessoa("Carlos", 30));
        listaDePessoas.add(new Pessoa("Beatriz", 19));
        
        List<String> nomesOrdenados = listaDePessoas.stream()
            .filter(p -> p.getIdade() > 18)
            .map(Pessoa::getNome)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(nomesOrdenados);
    }
}
