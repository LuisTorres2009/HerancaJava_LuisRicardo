public class Gerente extends Funcionario {
    // Construtor da classe Gerente, que chama o construtor da classe Funcionario
    public Gerente(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);  // Chama o construtor de Funcionario para inicializar os atributos
    }

    // Método específico para Gerente, que simula a realização de uma reunião
    public void realizarReuniao() {
        System.out.println(nome + " estava realizando uma reunião.");
    }

    // Sobrescrita do método mostrarDados para incluir o cargo de Gerente
    @Override
    public void mostrarDados() {
        super.mostrarDados();  // Chama o método mostrarDados da classe Funcionario
        System.out.println("Cargo: Gerente");  // Exibe que o cargo do funcionário é Gerente
    }
}