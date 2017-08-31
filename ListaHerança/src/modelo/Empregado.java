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
public class Empregado extends Pessoa {

    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    public Empregado() {

    }

    public Empregado(int codigoSetor, float salarioBase, float imposto, String nome) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float calcularSalario() {
        return (salarioBase - (salarioBase * (imposto / 100)));

    }

    public void printEmpregado() {

        System.out.println("--------------------------------------");

        System.out.println("Nome                        :     " + this.getNome());

        System.out.println("Código do Setor             :     " + this.getCodigoSetor());

        System.out.println("Salário Base                :  R$ " + this.getSalarioBase());

        System.out.println("Porcentagem dos impostos    :     " + this.getImposto() + "%");

        System.out.println("Salário Final               :  R$ " + this.calcularSalario());

        System.out.println("--------------------------------------");
    }
}
