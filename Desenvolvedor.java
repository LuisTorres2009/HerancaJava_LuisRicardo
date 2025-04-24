public class Desenvolvedor extends Funcionario {
    // Construtor da classe Desenvolvedor, que chama o construtor da classe Funcionario
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);  // Chama o construtor de Funcionario para inicializar os atributos
    }

    // Método específico para Desenvolvedor, que simula a programação
    public void programar() {
        System.out.println(nome + " estava programando.");
    }

    // Sobrescrita do método mostrarDados para incluir o cargo de Desenvolvedor
    @Override
    public void mostrarDados() {
        super.mostrarDados();  // Chama o método mostrarDados da classe Funcionario
        System.out.println("Cargo: Desenvolvedor");  // Exibe que o cargo do funcionário é Desenvolvedor
    }
}