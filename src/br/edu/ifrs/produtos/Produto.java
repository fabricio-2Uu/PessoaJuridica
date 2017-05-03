/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.produtos;

import br.edu.ifrs.pessoas.Fornecedor;
import java.util.LinkedList;

/**
 *
 * @author 0682160
 */
public class Produto {

    private long codBarras;
    private String nome;
    private double valor;
    private LinkedList<Fornecedor> fornecedor = new LinkedList();

    public Produto(long codBarras, String nome, double valor) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.valor = valor;
    }

    public Produto() {
    }
    
    
    public void listar() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String aux = "";
        for (Fornecedor forn : fornecedor) {
            aux += forn.toString() + "\n";
        }
        return "Produto{" + "codBarras=" + codBarras + ", nome=" + nome
                + ", valor=" + valor + "\n" + aux + "}";

    }

    public long getCodBarras() {
        return codBarras;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public LinkedList<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addFornecedor(Fornecedor fornecedor) {
        this.fornecedor.add(fornecedor);
    }

}
