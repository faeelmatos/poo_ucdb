/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Fornecedor;

/**
 *
 * @author RAFAEL
 */
public class ListaDeFonecedores {

    private ArrayList<Fornecedor> fornecedores;

    public ListaDeFonecedores() {
        fornecedores = new ArrayList<Fornecedor>();

    }

    //inserir fornecedores no ArrayList
    public void addFornecedor(Fornecedor obj) {
        fornecedores.add(obj);

    }

    //listagem de todos os Fornecedores
    public void listaTodosOsFornecedores() {
        if (fornecedores.size() > 0) {
            for (Fornecedor obj : fornecedores) {
                obj.printFornecedor();
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }
}
