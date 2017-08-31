/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.Administrador;

/**
 *
 * @author RAFAEL
 */
public class ListaDeAdministradores {

    private ArrayList<Administrador> adms;

    public ListaDeAdministradores() {
        adms = new ArrayList<Administrador>();

    }

    //inserir adms no ArrayList
    public void addAdministrador(Administrador obj) {
        adms.add(obj);

    }

    //listagem de todos os Administradores
    public void listaTodosOsAdministradores() {
        if (adms.size() > 0) {
            for (Administrador obj : adms) {
                obj.printAdministrador();
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }
}
