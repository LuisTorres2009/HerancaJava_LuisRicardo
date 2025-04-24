import java.util.ArrayList;  // Importa a classe ArrayList para armazenar os funcionários.
import java.util.Scanner;    // Importa a classe Scanner para ler entradas do usuário.

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  // Cria o scanner para ler entradas.
        ArrayList<Funcionario> funcionarios = new ArrayList<>();  // Cria a lista de funcionários.

        while (true) {  // Laço infinito para manter o menu em execução.
            System.out.println(" --------------------------------------------------------- "); 
            System.out.println("|                            MENU                         |");  // Exibe o menu de opções.
            System.out.println(" --------------------------------------------------------- "); 
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Exibir Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt(); 
            scanner.nextLine();

            switch (opcao) {  // Processa a opção escolhida.
                
                case 1:  // Caso de cadastrar funcionário

                    System.out.println(" --------------------------------------------- "); 
                    System.out.println("|          Cadastro de funcionários           |");  
                    System.out.println(" --------------------------------------------- "); 
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();  
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();  
                    scanner.nextLine();  
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();  
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();  
                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    String dataNascimento = scanner.nextLine();

                    int tipoFuncionario = 0;

                    // Loop até o usuário escolher um tipo válido.
                    System.out.println("Digite o tipo de funcionário:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Desenvolvedor");
                    System.out.println("3 - Estagiário");
                    
                    while (tipoFuncionario < 1 || tipoFuncionario > 3) {
                        System.out.print("Escolha: ");
                        tipoFuncionario = scanner.nextInt();
                    
                        if (tipoFuncionario < 1 || tipoFuncionario > 3) {
                            System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
                        }
                    }                    

                    // Cria o funcionário de acordo com a escolha do tipo.
                    Funcionario novoFuncionario = null;
                    switch (tipoFuncionario) {
                        case 1:  
                            novoFuncionario = new Gerente(nome, salario, departamento, cpf, dataNascimento);
                            break;
                        case 2:  
                            novoFuncionario = new Desenvolvedor(nome, salario, departamento, cpf, dataNascimento);
                            break;
                        case 3:  
                            novoFuncionario = new Estagiario(nome, salario, departamento, cpf, dataNascimento);
                            break;
                    }

                    funcionarios.add(novoFuncionario);  // Adiciona o novo funcionário à lista.
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;



                case 2:  // Caso de exibir funcionários
                    System.out.println(" --------------------------------------------- "); 
                    System.out.println("|          Exibição de funcionários           |");  
                    System.out.println(" --------------------------------------------- "); 
                    if (funcionarios.isEmpty()) {  // Verifica se a lista está vazia.
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : funcionarios) {  
                            f.mostrarDados();  // Exibe os dados do funcionário.
                            f.baterPonto();  // Registra o ponto do funcionário.

                            // Executa uma ação específica dependendo do tipo de funcionário.
                            if (f instanceof Gerente) {
                                ((Gerente) f).realizarReuniao();
                            } else if (f instanceof Desenvolvedor) {
                                ((Desenvolvedor) f).programar();
                            } else if (f instanceof Estagiario) {
                                ((Estagiario) f).fazerTarefa();
                            }
                            System.out.println("-----------------------------------"); 

                        }
                    }
                    break;

                case 0:  // Caso de sair do programa
                    System.out.println("Saindo...");
                    scanner.close();  
                    return; 

                default:  // Caso o usuário escolha uma opção inválida
                    System.out.println("Opção inválida.");
            }
        }
    }
}