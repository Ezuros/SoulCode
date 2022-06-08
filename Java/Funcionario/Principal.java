package Funcionario;

import Aula3.Animal;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Daniel", 25, "Desenvolvedor", "Ativo");
        Funcionario f2 = new Funcionario("Carol", 31, "Auxiliar de vendas", "Ativo");
        Funcionario f3 = new Funcionario("Eduarda", 26, "Auxiliar administrativo", "Ativo");
        Funcionario f4 = new Funcionario("Rodrigo", 29, "Gestor de marketing", "Ativo");

        //- demitir o funcionário 1
        f1.demitirFuncionario();
        System.out.println("Funcionário(a) " + f1.getNome() + " está " + f1.getSituacao());

        //- promover o funcionário 2
        f2.trocarCargoFuncionario("Gerente de vendas");
        System.out.println("Funcionário(a) " + f2.getNome() + " teve o cargo alterado para: " + f2.getCargo());

        //- "aniversariar" o funcionário 3
        f3.fazerAniversario();
        System.out.println("Funcionário(a) " + f3.getNome() + " fez aniversãrio e agora tem " + f3.getIdade() + " anos");

        //- pagar salário do funcionário 4
        f4.pagarSalario();

    }
}
