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
public class Fornecedor extends Pessoa {

    private float valorCredito;
    private float valorDivida;

    /**
     * Contrutor padrão
     */
    public Fornecedor() {
    }

    /**
     * Construtor que recebe dois floats e os três atributos da classe Pessoa
     *
     * @param valorCredito
     * @param valorDivida
     * @param nome
     * @param endereco
     * @param telefone
     */
    public Fornecedor(float valorCredito, float valorDivida, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    /**
     * Construtor que recebe um float e uma String
     *
     * @param valorCredito
     * @param nome
     */
    public Fornecedor(float valorCredito, String nome) {
        super(nome);
        this.valorCredito = valorCredito;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float obterSaldo() {
        return (this.valorCredito - this.valorDivida);

    }

    public void printFornecedor() {

        System.out.println("--------------------------------------");

        System.out.println("Nome             :     " + this.getNome());

        System.out.println("Endereço         :     " + this.getEndereco());

        System.out.println("Telefone         :     " + this.getTelefone());

        System.out.println("Valor de cérdito :  R$ " + this.getValorCredito());

        System.out.println("Valor da dívida  :  R$ " + this.getValorDivida());

        System.out.println("Saldo final      :  R$ " + this.obterSaldo());

        System.out.println("--------------------------------------");

    }
}
