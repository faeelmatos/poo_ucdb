/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author RAFAEL
 */
public class Administrador extends Empregado {

    private float ajudaDeCusto;

    public Administrador() {

    }

    public Administrador(float ajudaDeCusto, int codigoSetor, float salarioBase, float imposto, String nome) {
        super(codigoSetor, salarioBase, imposto, nome);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public float calcularSalarioAdm() {
        return (super.calcularSalario() + ajudaDeCusto);

    }

    public void printAdministrador() {

        System.out.println("--------------------------------------");

        System.out.println("Nome                       :     " + this.getNome());

        System.out.println("Código do Setor            :     " + this.getCodigoSetor());

        System.out.println("Salário Base               :  R$ " + this.getSalarioBase());

        System.out.println("Porcentagem dos impostos   :     " + this.getImposto() + "%");

        System.out.println("Valor da (ajuda de Custo)  :  R$ " + this.getAjudaDeCusto());

        System.out.println("Salário Final              :  R$ " + this.calcularSalarioAdm());

        System.out.println("--------------------------------------");

    }

}
