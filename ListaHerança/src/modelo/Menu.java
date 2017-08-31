/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import cadastro.CadastroAdministrador;
import cadastro.CadastroEmpregado;
import cadastro.CadastroFornecedor;
import controle.ListaDeAdministradores;
import controle.ListaDeEmpregados;
import controle.ListaDeFonecedores;
import java.util.Scanner;

/**
 *
 * @author ra159031
 */
public class Menu {

    public static void rodar() {

        int opcao = 99;

        Scanner scanf = new Scanner(System.in);

        CadastroAdministrador cadastroAdministrador = new CadastroAdministrador();
        CadastroEmpregado cadastroEmpregado = new CadastroEmpregado();
        CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();

        ListaDeAdministradores listaDeAdministradores = new ListaDeAdministradores();
        ListaDeEmpregados listaDeEmpregados = new ListaDeEmpregados();
        ListaDeFonecedores listaDeFonecedores = new ListaDeFonecedores();

        System.out.println("------------------------------------------");
        System.out.println("Praticando Orientação ao Objeto!");
        System.out.println("------------------------------------------");

        while (opcao != 0) {

            System.out.println();
            System.out.println("Opções:\n");
            System.out.println("-------------------------------------------------------");
            System.out.println("1 - Cadastrar Fornecedor");
            System.out.println("2 - Cadastrar Empregado");
            System.out.println("3 - Cadastrar Administrador");
            System.out.println("4 - Imprimir lista de Fornecedores");
            System.out.println("5 - Imprimir lista de Empregados");
            System.out.println("6 - Imprimir lista de Administradores");
            System.out.println("0 - Sair");
            System.out.println("-------------------------------------------------------");
            
            System.out.print("\nInforme a opção desejada: ");
            opcao = Integer.parseInt(scanf.nextLine());
            System.out.println();

            switch (opcao) {
                case 1:
                    cadastroFornecedor.cadastrarFornecedor();
                    break;
                case 2:
                    cadastroEmpregado.cadastrarEmpregado();
                    break;
                case 3:
                    cadastroAdministrador.cadastrarAdministrador();
                    break;
                case 4:
                    listaDeFonecedores.listaTodosOsFornecedores();
                    break;
                case 5:
                    listaDeEmpregados.listaTodosOsEmpregados();
                    break;
                case 6:
                    listaDeAdministradores.listaTodosOsAdministradores();
                    break;
                default:
                    break;
            }

        }

        //-------------------SAIR-----------------------
        System.out.println("Aplicação encerrada!");

    }

}
