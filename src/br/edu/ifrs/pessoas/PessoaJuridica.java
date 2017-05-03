/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.pessoas;

/**
 *
 * @author 0682160
 */
public abstract class PessoaJuridica {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    public abstract void listar();
    
    @Override
    public abstract String toString();
    
}
