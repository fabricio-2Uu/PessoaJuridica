/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.pessoas;

import br.edu.ifrs.contatos.Endereco;

/**
 *
 * @author 0682160
 */
public class Fornecedor extends PessoaJuridica{
    
    private String nomeContato;
    private Endereco endereco;

    public Fornecedor(String nomeContato, String cnpj, String razaoSocial, Endereco endereco) {
        super(cnpj, razaoSocial);
        this.nomeContato = nomeContato;
        this.endereco = endereco;
    }
    

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    

    @Override
    public String toString() {
        return "Fornecedor{" + "nomeContato=" + nomeContato + ", logradouro=" + 
                endereco.getLogradouro() + "complemento=" + endereco.getComplemento() + '}';
    }
    
    public void listar (){
        System.out.println(this.toString());
    }
}
