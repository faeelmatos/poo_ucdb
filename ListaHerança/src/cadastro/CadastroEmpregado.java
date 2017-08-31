/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import controle.ListaDeEmpregados;
import java.util.Scanner;
import modelo.Empregado;

/**
 *
 * @author ra159031
 */
public class CadastroEmpregado {

    int op = 0;

    /**
     * Método para setar os valores do Empregado
     */
    public void cadastrarEmpregado() {

        ListaDeEmpregados listaE = new ListaDeEmpregados();
        Scanner scanf = new Scanner(System.in);

        Empregado e = new Empregado();

        System.out.print("Cadastro de Empregado\n"
                + "-------------------------------------------------------\n");

        System.out.print("Digite o nome                       : ");
        e.setNome(scanf.nextLine());

        System.out.print("Digite o código do setor            : ");
        e.setCodigoSetor(Integer.parseInt(scanf.nextLine()));

        System.out.print("Digite o salário base               : ");
        e.setSalarioBase(Float.parseFloat(scanf.nextLine()));

        System.out.print("Digite a porcentagem dos impostos   : ");
        e.setImposto(Float.parseFloat(scanf.nextLine()));

        System.out.print("Salário final                       : " + e.calcularSalario());

        System.out.println("\n-------------------------------------------------------");

        listaE.addEmpregado(e);

    }
}
