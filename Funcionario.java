public class Funcionario extends Pessoa { 
    // Atributos da classe Funcionario, que herda de Pessoa
    protected String nome;
    protected double salario;
    protected String departamento; 

    // Construtor que inicializa os atributos de Funcionario e herda os da classe Pessoa
    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(cpf, dataNascimento);  // Chama o construtor da classe Pessoa para inicializar cpf e dataNascimento
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para exibir os dados do funcionário
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("CPF: " + cpf);  // Acessa o atributo cpf herdado de Pessoa
        System.out.println("Data de Nascimento: " + dataNascimento);  // Acessa o atributo dataNascimento herdado de Pessoa
    }

    // Método para bater o ponto
    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }
}