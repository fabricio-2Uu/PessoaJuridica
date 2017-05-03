/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoajuridica;

import br.edu.ifrs.produtos.Produto;
import br.edu.ifrs.contatos.Endereco;
import br.edu.ifrs.pessoas.Fornecedor;

/**
 *
 * @author 0682160
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Endereco end1 = new Endereco("Rua X", "Apt. 900");
        
        Fornecedor forn1 = new Fornecedor("Joao", "25.410/0001-98", 
                "Razao da Vida Ltda.", end1);
        
        Fornecedor forn2 = new Fornecedor("Mauro", "85.963/0001-74", 
                "Vida Sem Razao Ltda.", end1);
        
        Produto prod1 = new Produto(9658743, "Feijao da Sorte", 3.65);
        Produto prod2 = new Produto();

        prod1.addFornecedor(forn1);
        prod1.addFornecedor(forn2);
        
        prod1.listar();
        prod2.listar();
    }

}