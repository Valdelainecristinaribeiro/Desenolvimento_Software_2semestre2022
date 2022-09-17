package meuprimeirojava;

public class Aluno {

    private String nome;
    private String sobrenome;
    private String ra;
    private int idade;
    private String telefone;

    public Aluno(String nome, String sobrenome, String ra, int idade, String telefone) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRa() {
        return ra;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    double media(double nota1, double nota2, double nota3) {
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
    }

}
