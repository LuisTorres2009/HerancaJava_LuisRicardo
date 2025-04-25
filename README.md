# **Sistema de Cadastro de Funcionários**

## **Descrição**

Este projeto simula um **sistema de cadastro de funcionários** de uma empresa, permitindo o cadastro e a exibição de diferentes tipos de funcionários (**Gerente**, **Desenvolvedor**, **Estagiário**).

Link do vídeo: https://drive.google.com/file/d/1t8oduUuNqK0n7rW_6RiXjTsBCzlBbeUx/view?usp=sharing

## **Funcionalidades**

- **Cadastrar Funcionários**: O sistema permite cadastrar funcionários com nome, salário, departamento, CPF, data de nascimento e tipo (**Gerente**, **Desenvolvedor** ou **Estagiário**).
- **Exibir Funcionários**: Exibe os dados de todos os funcionários cadastrados.
- **Ações Específicas**:
  - **Gerente**: Realiza reuniões.
  - **Desenvolvedor**: Programa tarefas.
  - **Estagiário**: Realiza tarefas designadas.

## **Estrutura do Projeto**

- **Pessoa**: Classe base contendo **CPF** e **data de nascimento**.
- **Funcionario**: Classe que herda **Pessoa** e inclui **nome**, **salário**, e **departamento**. Tem os métodos `mostrarDados()` e `baterPonto()`.
- **Gerente**, **Desenvolvedor**, **Estagiário**: Classes que herdam de **Funcionario** e implementam comportamentos específicos (**realizar reuniões**, **programar**, **fazer tarefas**).
- **Main**: Classe principal que executa o programa e interage com o usuário.

## **Como Executar**

1. **Clone ou baixe** este repositório.
2. **Abra o projeto** em um editor de código, como o VSCode.
3. **Compile e execute** a classe `Main`.
4. **Use o menu interativo** no terminal para cadastrar ou exibir funcionários.

### **Exemplo de Execução**
#### **Menu**
```
 ---------------------------------------------
|                     MENU                    |
 ---------------------------------------------
1. Cadastrar Funcionário
2. Exibir Funcionários
0. Sair
Escolha uma opção: 1
```

#### **Cadastro de Funcionário**
```
 ---------------------------------------------
|           Cadastro de funcionários          |
 ---------------------------------------------
Nome: João
Salário: 5000
Departamento: TI
CPF: 123.456.789-00
Data de nascimento (dd/mm/aaaa): 15/08/1990
Digite o tipo de funcionário:
1 - Gerente
2 - Desenvolvedor
3 - Estagiário
Escolha: 1
Funcionário cadastrado com sucesso!
```

#### **Exibição de Funcionários**

```
 ---------------------------------------------
|          Funcionários Cadastrados           |
 ---------------------------------------------
Nome: João
Salário: 5000.0
Departamento: TI
CPF: 123.456.789-00
Data de Nascimento: 15/08/1990
Cargo: Gerente
João bateu o ponto.
João estava realizando uma reunião.
-----------------------------------------------
```


© 2025 Luis Ricardo. Todos os direitos reservados.  
