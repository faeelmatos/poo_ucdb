/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Empregado;

/**
 *
 * @author RAFAEL
 */
public class ListaDeEmpregados {

    private ArrayList<Empregado> empregados;

    public ListaDeEmpregados() {
        empregados = new ArrayList<Empregado>();

    }

    //inserir empregados no ArrayList
    public void addEmpregado(Empregado obj) {
        empregados.add(obj);

    }

    //listagem de todos os Empregados
    public void listaTodosOsEmpregados() {
        if (empregados.size() > 0) {
            for (Empregado obj : empregados) {
                obj.printEmpregado();
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }
}
