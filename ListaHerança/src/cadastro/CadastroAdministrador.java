/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import controle.ListaDeAdministradores;
import java.util.Scanner;
import modelo.Administrador;

/**
 *
 * @author ra159031
 */
public class CadastroAdministrador {

    int op = 0;

    /**
     * Método para setar os valores do Administrador
     */
    public void cadastrarAdministrador() {

        ListaDeAdministradores listaA = new ListaDeAdministradores();
        Scanner scanf = new Scanner(System.in);

        Administrador a = new Administrador();

        System.out.print("Cadastro de Administrador\n"
                + "-------------------------------------------------------\n");

        System.out.print("Digite o nome                         : ");
        a.setNome(scanf.nextLine());

        System.out.print("Digite o código do setor              : ");
        a.setCodigoSetor(Integer.parseInt(scanf.nextLine()));

        System.out.print("Digite o salário base                 : ");
        a.setSalarioBase(Float.parseFloat(scanf.nextLine()));

        System.out.print("Digite a porcentagem dos impostos     : ");
        a.setImposto(Float.parseFloat(scanf.nextLine()));

        System.out.print("Digite o valor da (ajuda de custo)    : ");
        a.setAjudaDeCusto(Float.parseFloat(scanf.nextLine()));

        System.out.print("Salário final                         : " + a.calcularSalarioAdm());

        System.out.println("\n-------------------------------------------------------");

        listaA.addAdministrador(a);

    }
}
