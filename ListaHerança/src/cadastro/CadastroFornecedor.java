/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import controle.ListaDeFonecedores;
import java.util.Scanner;
import modelo.Fornecedor;

/**
 *
 * @author ra159031
 */
public class CadastroFornecedor {

    int op = 0;

    /**
     * Método para setar os valores do Fornecedor
     */
    public void cadastrarFornecedor() {

        ListaDeFonecedores listaF = new ListaDeFonecedores();
        Scanner scanf = new Scanner(System.in);

        Fornecedor f = new Fornecedor();

        System.out.print("Cadastro de Fornecedor\n"
                + "-------------------------------------------------------\n");

        System.out.print("Digite o nome               : ");
        f.setNome(scanf.nextLine());

        System.out.print("Digite o endereço           : ");
        f.setEndereco(scanf.nextLine());

        System.out.print("Digite o telefone           : ");
        f.setTelefone(scanf.nextLine());

        System.out.print("Digite o valor do crédito   : ");
        f.setValorCredito(Float.parseFloat(scanf.nextLine()));

        System.out.print("Digite o valor da dívida    : ");
        f.setValorDivida(Float.parseFloat(scanf.nextLine()));

        System.out.print("Saldo final                 : " + f.obterSaldo());

        System.out.println("\n-------------------------------------------------------");

        listaF.addFornecedor(f);

    }
}
