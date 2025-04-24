public class Estagiario extends Funcionario {
    // Construtor da classe Estagiario, que chama o construtor da classe Funcionario
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);  // Chama o construtor de Funcionario para inicializar os atributos
    }

    // Método específico para Estagiário, que simula a realização de uma tarefa
    public void fazerTarefa() {
        System.out.println(nome + " estava fazendo uma tarefa.");
    }

    // Sobrescrita do método mostrarDados para incluir o cargo de Estagiário
    @Override
    public void mostrarDados() {
        super.mostrarDados();  // Chama o método mostrarDados da classe Funcionario
        System.out.println("Cargo: Estagiário");  // Exibe que o cargo do funcionário é Estagiário
    }
}